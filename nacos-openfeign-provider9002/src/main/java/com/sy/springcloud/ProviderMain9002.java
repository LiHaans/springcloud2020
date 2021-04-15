package com.sy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: lihang
 * @Date: 2021-04-13 16:55
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderMain9002 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderMain9002.class, args);
    }
}
