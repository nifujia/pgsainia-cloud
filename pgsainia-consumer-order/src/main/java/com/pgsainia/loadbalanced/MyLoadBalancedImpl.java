package com.pgsainia.loadbalanced;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author nifujia
 * @date 2021/5/10 22:57
 * @description
 */
@Component
public class MyLoadBalancedImpl implements MyLoadBalanced {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    /**
     * 使用 cas 计算接口请求的次数，防止并发
     *
     * @return
     */
    public final int getAndIncrement() {
        int current;
        int next;
        do {
            current = this.atomicInteger.get();
            next = current >= Integer.MAX_VALUE ? 0 : current + 1;
        } while (!this.atomicInteger.compareAndSet(current, next));
        return next;
    }

    /**
     * 负载均衡算法: 接口第几次请求数 % 服务器集群总数量 =实 际调用服务器位置下标.每次服务重启动后 rest 接口计数从 1 开始。
     *
     * @param serviceInstances
     * @return
     */
    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrement() % serviceInstances.size();
        return serviceInstances.get(index);
    }
}