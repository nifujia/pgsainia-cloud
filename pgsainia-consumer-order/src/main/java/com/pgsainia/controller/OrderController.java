package com.pgsainia.controller;

import com.pgsainia.loadbalanced.MyLoadBalanced;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

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

    @Resource
    private DiscoveryClient discoveryClient;

    @Resource
    private MyLoadBalanced loadBalanced;

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

    @RequestMapping("/consumer/cloud/lb")
    public String lb() {
        List<ServiceInstance> instances = discoveryClient.getInstances("PGSAINIA-PROVIDER-PAY-CLOUD");
        if (instances == null || instances.size() <= 0) {
            return null;
        }
        ServiceInstance serviceInstance = loadBalanced.instances(instances);
        URI uri = serviceInstance.getUri();
        return restTemplate.getForObject(uri + "/provider/cloud/myLb", String.class);
    }
}