package com.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author nifujia
 * @date 2021/5/10 22:26
 * @description
 */
@Configuration
public class MyRule {

    @Bean
    public IRule iRule() {
        // 修改负载均衡算法为随机
        return new RandomRule();
    }
}