package com.sy.springcloud.service;

import com.sy.springcloud.hystrix.RemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Auther: lihang
 * @Date: 2021-04-13 17:03
 * @Description:
 */
@FeignClient(name="nacos-openfeign-provider",fallback = RemoteHystrix.class)
public interface RemoteClient {

    @GetMapping("nacos/get/{id}")
    public String get(@PathVariable("id") String id);
}
