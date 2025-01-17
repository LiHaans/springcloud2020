package com.sy.springclond.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Auther: lihang
 * @Date: 2020-12-06 17:00
 * @Description:
 */
@RestController
@Slf4j
public class OrderController {

    private static final String INVOME_URL = "http://consul-provider-payment";

    @Resource
    private RestTemplate restTemplate;


    @GetMapping("consumer/payment/consul")
    public String consul(){
        return restTemplate.getForObject(INVOME_URL+"/payment/consul",String.class);
    }

}
