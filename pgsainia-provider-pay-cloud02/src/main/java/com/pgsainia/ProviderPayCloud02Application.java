package com.pgsainia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author nifujia
 * @date 2021/4/3 17:50
 * @description
 */
@SpringBootApplication
@EnableEurekaClient
public class ProviderPayCloud02Application {
    public static void main(String[] args) {
        SpringApplication.run(ProviderPayCloud02Application.class, args);
    }
}