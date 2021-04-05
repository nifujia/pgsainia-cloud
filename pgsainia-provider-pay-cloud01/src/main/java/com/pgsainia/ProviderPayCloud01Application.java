package com.pgsainia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author nifujia
 * @date 2021/4/3 17:47
 * @description
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ProviderPayCloud01Application {
    public static void main(String[] args) {
        SpringApplication.run(ProviderPayCloud01Application.class, args);
    }
}