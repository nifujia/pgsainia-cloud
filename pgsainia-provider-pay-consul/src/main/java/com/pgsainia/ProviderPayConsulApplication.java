package com.pgsainia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author nifujia
 * @date 2021/4/6 23:49
 * @description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderPayConsulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderPayConsulApplication.class, args);
    }
}