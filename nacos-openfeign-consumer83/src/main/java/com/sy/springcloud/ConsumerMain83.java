package com.sy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Auther: lihang
 * @Date: 2021-04-13 17:03
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ConsumerMain83 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerMain83.class,args);
    }
}
