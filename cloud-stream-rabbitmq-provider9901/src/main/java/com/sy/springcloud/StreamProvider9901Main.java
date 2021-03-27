package com.sy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: lihang
 * @Date: 2021-03-02 21:41
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamProvider9901Main {

    public static void main(String[] args) {
        SpringApplication.run(StreamProvider9901Main.class, args);
    }
}
