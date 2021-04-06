package com.pgsainia.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author nifujia
 * @date 2021/4/6 23:57
 * @description
 */
@RestController
public class OrderController {

    private static final String PAY_URL = "http://pgsainia-provider-pay-consul";
    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/order/{id}")
    public String order(@PathVariable Long id) {
        return restTemplate.getForObject(PAY_URL + "/provider/consul/pay/" + id, String.class);
    }
}