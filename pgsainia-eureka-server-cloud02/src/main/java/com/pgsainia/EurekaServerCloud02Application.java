package com.pgsainia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author nifujia
 * @date 2021/4/3 17:20
 * @description
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerCloud02Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerCloud02Application.class, args);
    }
}