package com.pgsainia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 启动类
 *
 * @author nifujia
 */
@SpringBootApplication
@EnableFeignClients
public class ConsumerOpenfeignOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerOpenfeignOrderApplication.class, args);
    }
}
