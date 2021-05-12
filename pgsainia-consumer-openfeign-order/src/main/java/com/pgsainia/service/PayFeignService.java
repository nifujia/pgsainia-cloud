package com.pgsainia.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.websocket.server.PathParam;

/**
 * @author nifujia
 * @date 2021/5/12 23:49
 * @description
 */
@Component
@FeignClient(value = "PGSAINIA-PROVIDER-PAY-CLOUD")
public interface PayFeignService {

    @GetMapping(value = "/provider/cloud/pay/{id}")
    String get(@PathVariable("id") Long id);
}

