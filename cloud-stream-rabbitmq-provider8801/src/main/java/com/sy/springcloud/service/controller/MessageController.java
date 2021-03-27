package com.sy.springcloud.service.controller;

import com.sy.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Auther: lihang
 * @Date: 2020-12-21 11:23
 * @Description:
 */
@RestController
public class MessageController {

    @Resource
    private IMessageProvider messageProvider;

    @GetMapping("/sendMessage")
    public void sendMessage(){
        messageProvider.send();
    }
}
