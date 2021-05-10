package com.pgsainia.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author nifujia
 * @date 2021/4/3 16:43
 * @description
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    //@LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}