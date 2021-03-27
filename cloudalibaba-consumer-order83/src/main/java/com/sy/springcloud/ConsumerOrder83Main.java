package com.sy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: lihang
 * @Date: 2021-03-04 14:40
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerOrder83Main {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerOrder83Main.class, args);
    }
}
