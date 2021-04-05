package com.pgsainia.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author nifujia
 * @date 2021/4/5 11:41
 * @description
 */
@RestController
public class PayController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/provider/pay/zk")
    public String pay() {
        return "Provider Spring Cloud  Zookeeper，ServerPort:" + serverPort + "，uuid:" + UUID.randomUUID();
    }
}