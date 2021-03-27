package com.sy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Auther: lihang
 * @Date: 2021-03-01 21:17
 * @Description:
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenter3344Main {

    public static void main(String[] args) {
        SpringApplication.run(ConfigCenter3344Main.class, args);
    }
}
