package com.sy.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import javax.validation.constraints.Size;

/**
 * @Auther: lihang
 * @Date: 2020-12-06 15:26
 * @Description:
 */
@RestController
@Slf4j
public class OrderController {

    private static final String INVOME_URL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value="/consumer/payment/zk")
    public String payment(){
        String result = restTemplate.getForObject(INVOME_URL + "/payment/zk", String.class);
        return result;

    }
}
