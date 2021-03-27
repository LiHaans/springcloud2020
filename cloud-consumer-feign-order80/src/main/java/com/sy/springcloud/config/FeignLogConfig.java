package com.sy.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: lihang
 * @Date: 2020-12-09 13:50
 * @Description:
 */
@Configuration
public class FeignLogConfig {

    @Bean
    public Logger.Level setLoggerLevel(){
        return Logger.Level.FULL;
    }
}
