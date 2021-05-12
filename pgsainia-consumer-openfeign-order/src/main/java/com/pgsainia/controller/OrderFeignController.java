package com.pgsainia.controller;

import com.pgsainia.service.PayFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author nifujia
 * @date 2021/5/12 23:54
 * @description
 */
@RestController
@RequestMapping("/consumer")
public class OrderFeignController {
    @Resource
    private PayFeignService payFeignService;

    @GetMapping(value = "/order/get/{id}")
    public String order(@PathVariable("id") Long id) {
        String result = payFeignService.get(id);
        return result;
    }
}