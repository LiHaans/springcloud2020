package com.sy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: lihang
 * @Date: 2021-03-01 13:25
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class Gateway9528Main {

    public static void main(String[] args) {
        SpringApplication.run(Gateway9528Main.class, args);
    }
}
