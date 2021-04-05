package com.pgsainia.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author nifujia
 * @date 2021/4/5 12:01
 * @description
 */
@RestController
public class OrderController {

    private static final String PAY_URL = "http://pgsainia-provider-pay-zk";

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/order/{id}")
    public String order(@PathVariable Long id) {
        return "Id 为 :" + id + "pay result :" + restTemplate.getForObject(PAY_URL + "/provider/pay/zk", String.class);
    }
}