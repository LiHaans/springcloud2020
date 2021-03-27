package com.sy.springcloud.service;

import org.springframework.messaging.Message;

/**
 * @Auther: lihang
 * @Date: 2021-03-02 22:33
 * @Description:
 */
public interface IReceiver {

    void receiver(Message message);
}
