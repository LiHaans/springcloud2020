package com.sy.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: lihang
 * @Date: 2021-03-01 13:48
 * @Description:
 */
@Configuration
public class RouteLocatorConfig {

    @Bean
    public RouteLocator customerRouteLocator(RouteLocatorBuilder builder){
        RouteLocatorBuilder.Builder routes = builder.routes();
        routes.route("path-guonei", r -> r.path("/guonei").uri("http://news.baidu.com/guonei"));
        routes.route("path-guoji", r -> r.path("/guoji").uri("http://news.baidu.com/guoji"));
        return routes.build();
    }

}
