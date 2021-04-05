package com.pgsainia.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author nifujia
 * @date 2021/4/3 17:57
 * @description
 */
@RestController
@RequestMapping("/provider")
@Slf4j
public class PayCloudController {

    @Value("${server.port}")
    private Long serverPort;

    @Resource
    private DiscoveryClient discoveryClient;


    @RequestMapping("/cloud/pay/{id}")
    public String goods(@PathVariable Long id) {
        return "cloud-server: cloud01, server-port: " + serverPort + "; id = " + id;
    }


    @GetMapping(value = "/payment/discovery")
    public Object discovery() {
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info("======= service =============: " + service);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("PGSAINIA-PROVIDER-PAY-CLOUD");
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId() + "\t" + instance.getHost() + "\t" + instance.getPort() + "\t" + instance.getUri());
        }
        return this.discoveryClient;
    }

}