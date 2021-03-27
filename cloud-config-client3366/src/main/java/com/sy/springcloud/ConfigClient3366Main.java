package com.sy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: lihang
 * @Date: 2021-03-02 12:25
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClient3366Main {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClient3366Main.class, args);
    }
}
