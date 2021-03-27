package com.sy.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Auther: lihang
 * @Date: 2021-03-04 14:45
 * @Description:
 */
@RestController
public class OrderController {

    @Value("${service-url.nacos-provider-service}")
    private String serviceUrl;

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/nacos/payment/get/{id}")
    public String get(@PathVariable("id") String id){

        return restTemplate.getForObject(serviceUrl+"/nacos/payment/get/"+id, String.class);
    }

}
