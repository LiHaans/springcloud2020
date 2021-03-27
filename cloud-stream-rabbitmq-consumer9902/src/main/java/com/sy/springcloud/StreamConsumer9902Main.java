package com.sy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: lihang
 * @Date: 2021-03-02 22:10
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamConsumer9902Main {
    public static void main(String[] args) {
        SpringApplication.run(StreamConsumer9902Main.class, args);
    }
}
