package com.sy.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: lihang
 * @Date: 2021-04-13 16:59
 * @Description:
 */
@RestController
public class ProviderController {

    @Value("${server.port}")
    private String port;


    @GetMapping("nacos/get/{id}")
    public String get(@PathVariable("id") String id) throws InterruptedException {
        Thread.sleep(1000);
        return "nacos openfeign "+id +"   "+port;
    }
}
