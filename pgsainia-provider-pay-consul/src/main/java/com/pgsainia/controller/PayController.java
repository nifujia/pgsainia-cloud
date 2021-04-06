package com.pgsainia.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author nifujia
 * @date 2021/4/6 23:50
 * @description
 */
@RestController
public class PayController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/provider/consul/pay/{id}")
    public String pay(@PathVariable Long id) {
        return "Spring Cloud, Provider Consul , Server Port:" + serverPort + ",UUID:" + UUID.randomUUID() + "id:" + id;
    }
}