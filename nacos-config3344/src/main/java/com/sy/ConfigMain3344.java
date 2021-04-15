package com.sy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: lihang
 * @Date: 2021-04-13 17:34
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
@RefreshScope
public class ConfigMain3344 {


    public static void main(String[] args) {
        SpringApplication.run(ConfigMain3344.class, args);
    }

    @Value("${nacos.info}")
    private String config;

    @GetMapping("nacos/config/get")
    public String getConfig(){
        return config;
    }
}
