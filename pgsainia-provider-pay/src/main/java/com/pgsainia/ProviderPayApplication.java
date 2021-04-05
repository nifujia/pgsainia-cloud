package com.pgsainia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author nifujia
 * @date 2021/3/31 23:35
 * @description
 */
@SpringBootApplication
@EnableEurekaClient
public class ProviderPayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderPayApplication.class, args);
    }
}