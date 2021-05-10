package com.pgsainia.loadbalanced;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author nifujia
 * @date 2021/5/10 22:56
 * @description
 */
public interface MyLoadBalanced {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}