package com.sy.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Auther: lihang
 * @Date: 2020-12-07 15:15
 * @Description:
 */
public interface MyLB {
    ServiceInstance chose(List<ServiceInstance> instances);
}
