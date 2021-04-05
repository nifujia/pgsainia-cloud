package com.pgsainia.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nifujia
 * @date 2021/3/31 23:45
 * @description
 */
@RestController
public class PayController {

    @RequestMapping("/provider/pay")
    public String pay() {
        return "Hello pay server....";
    }
}