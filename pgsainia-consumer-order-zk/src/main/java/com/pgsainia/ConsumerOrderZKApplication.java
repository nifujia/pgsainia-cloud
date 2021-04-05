package com.pgsainia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author nifujia
 * @date 2021/4/5 12:00
 * @description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerOrderZKApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerOrderZKApplication.class, args);
    }
}