package com.pgsainia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author nifujia
 * @date 2021/4/6 23:56
 * @description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerOrderConsulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerOrderConsulApplication.class, args);
    }
}