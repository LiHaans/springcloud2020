package com.sy.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Auther: lihang
 * @Date: 2020-12-06 16:47
 * @Description:
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String port;


    @GetMapping("/payment/consul")
    public String consul(){

        return "springcloud with consul : "+"\t"+port+"\t"+ UUID.randomUUID().toString();
    }
}
