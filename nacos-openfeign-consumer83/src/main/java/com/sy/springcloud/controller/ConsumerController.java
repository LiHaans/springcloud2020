package com.sy.springcloud.controller;

import com.sy.springcloud.service.RemoteClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: lihang
 * @Date: 2021-04-13 17:07
 * @Description:
 */
@RestController
public class ConsumerController {

    @Autowired
    private RemoteClient remoteClient;

    @GetMapping("consumer/nacos/get/{id}")
    public String get(@PathVariable("id") String id){
        return remoteClient.get(id);
    }
}
