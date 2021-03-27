package com.sy.springcloud.controller;

import com.sy.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Auther: lihang
 * @Date: 2021-03-02 21:47
 * @Description:
 */
@RestController
public class SendMessageController {

    @Resource
    private IMessageProvider provider;

    @GetMapping("sendMessage")
    public void sendMessage(){
        provider.send();
    }
}
