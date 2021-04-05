package com.pgsainia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author nifujia
 * @date 2021/4/5 11:21
 * @description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderPayZKApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderPayZKApplication.class, args);
    }
}