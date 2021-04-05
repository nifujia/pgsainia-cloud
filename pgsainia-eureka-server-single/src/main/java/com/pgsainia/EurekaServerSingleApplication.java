package com.pgsainia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author nifujia
 * @date 2021/3/31 23:13
 * @description
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerSingleApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerSingleApplication.class, args);
    }
}