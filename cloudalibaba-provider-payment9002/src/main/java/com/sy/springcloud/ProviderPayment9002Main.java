package com.sy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: lihang
 * @Date: 2021-03-04 14:07
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderPayment9002Main {

    public static void main(String[] args) {
        SpringApplication.run(ProviderPayment9002Main.class, args);
    }
}
