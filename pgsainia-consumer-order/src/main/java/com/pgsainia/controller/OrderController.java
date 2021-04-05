package com.pgsainia.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author nifujia
 * @date 2021/3/31 23:47
 * @description
 */
@RestController
public class OrderController {

    private static final String PAY_URL = "http://localhost:8081";
    private static final String PAY_CLOUD_URL = "http://PGSAINIA-PROVIDER-PAY-CLOUD";


    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/order")
    public String order() {
        return "Hi order server...";
    }

    @RequestMapping("/consumer/goods/{id}")
    public String goods(@PathVariable Long id) {
        String result = restTemplate.getForObject(PAY_URL + "/provider/pay", String.class);
        return "goods: id = " + id + ", result = " + result;
    }


        @RequestMapping("/consumer/cloud/goods/{id}")
        public String cloudGoods(@PathVariable Long id) {
            return restTemplate.getForObject(PAY_CLOUD_URL + "/provider/cloud/pay/" + id, String.class);
        }
    }