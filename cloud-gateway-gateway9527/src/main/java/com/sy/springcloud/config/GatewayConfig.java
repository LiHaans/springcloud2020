package com.sy.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: lihang
 * @Date: 2020-12-12 22:12
 * @Description:
 */
@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_guonei",r -> r.path("/guonei").uri("http://news.baidu.com/guonei")).build();
        routes.route("path_route_guoji",r -> r.path("/guoji").uri("http://news.baidu.com/guoji")).build();
        routes.route("path_route_mil",r -> r.path("/mil").uri("http://news.baidu.com/mil")).build();
        routes.route("path_route_finance",r -> r.path("/finance").uri("http://news.baidu.com/finance")).build();
        routes.route("path_route_ent",r -> r.path("/ent").uri("http://news.baidu.com/ent")).build();
        routes.route("path_route_sports",r -> r.path("/sports").uri("http://news.baidu.com/sports")).build();
        routes.route("path_route_internet",r -> r.path("/internet").uri("http://news.baidu.com/internet")).build();
        routes.route("path_route_tech",r -> r.path("/tech").uri("http://news.baidu.com/tech")).build();
        routes.route("path_route_game",r -> r.path("/game").uri("http://news.baidu.com/game")).build();
        routes.route("path_route_lady",r -> r.path("/lady").uri("http://news.baidu.com/lady")).build();
        routes.route("path_route_auto",r -> r.path("/auto").uri("http://news.baidu.com/auto")).build();
        routes.route("path_route_house",r -> r.path("/house").uri("http://news.baidu.com/house")).build();
        routes.route("path_route_home",r -> r.path("/").uri("http://news.baidu.com/")).build();
        return routes.build();
    }
}
