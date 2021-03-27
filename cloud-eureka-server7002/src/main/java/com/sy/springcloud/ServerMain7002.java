package com.sy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author:lihang
 * @create:2020-09-12 22:44
 */
@SpringBootApplication
@EnableEurekaServer
public class ServerMain7002 {
    public static void main(String[] args) {
        SpringApplication.run(ServerMain7002.class,args);
    }
}
