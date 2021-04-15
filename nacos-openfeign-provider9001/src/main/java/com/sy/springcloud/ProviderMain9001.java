package com.sy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: lihang
 * @Date: 2021-04-13 16:56
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderMain9001.class, args);
    }
}
