package com.sy.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Auther: lihang
 * @Date: 2020-12-06 14:47
 * @Description:
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value="/payment/zk")
    public String paymentZk(){
        return "springcloud with zookeeper : "+port+"\t"+ UUID.randomUUID().toString();
    }


}
