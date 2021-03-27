package com.sy.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: lihang
 * @Date: 2021-03-02 12:26
 * @Description:
 */
@RestController
@RefreshScope
public class ConfigController {

    @Value("${config}")
    private String config;

    @RequestMapping("configInfo")
    public String getConfigInfo(){
        return config;
    }
}
