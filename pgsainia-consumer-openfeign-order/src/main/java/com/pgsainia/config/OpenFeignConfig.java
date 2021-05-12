package com.pgsainia.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Level;

/**
 * @author nifujia
 * @date 2021/5/13 0:18
 * @description
 */
@Configuration
public class OpenFeignConfig {

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}