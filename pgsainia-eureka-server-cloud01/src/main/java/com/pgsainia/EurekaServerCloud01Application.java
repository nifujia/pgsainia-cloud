package com.pgsainia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author nifujia
 * @date 2021/4/3 17:16
 * @description
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerCloud01Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerCloud01Application.class, args);
    }
}