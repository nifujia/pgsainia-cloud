package com.pgsainia;

import com.rule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author nifujia
 * @date 2021/3/31 23:37
 * @description
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "PGSAINIA-PROVIDER-PAY-CLOUD", configuration = MyRule.class)
public class ConsumerOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerOrderApplication.class, args);
    }
}