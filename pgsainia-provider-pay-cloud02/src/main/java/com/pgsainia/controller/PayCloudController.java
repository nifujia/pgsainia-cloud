package com.pgsainia.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nifujia
 * @date 2021/4/3 17:57
 * @description
 */
@RestController
@RequestMapping("/provider")
public class PayCloudController {

    @Value("${server.port}")
    private Long serverPort;

    @RequestMapping("/cloud/pay/{id}")
    public String goods(@PathVariable Long id) {
        return "cloud-server: cloud02, server-port: " + serverPort + "; id = " + id;
    }

}