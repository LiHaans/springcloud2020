package com.sy.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: lihang
 * @Date: 2021-03-04 14:08
 * @Description:
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/nacos/payment/get/{id}")
    public String get(@PathVariable("id") String id){
        return "nacos register , serverPort: "+ port + " id : " + id;
    }
}
