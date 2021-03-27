package com.sy.springcloud.service.impl;

import com.sy.springcloud.service.IReceiver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;

/**
 * @Auther: lihang
 * @Date: 2021-03-02 22:12
 * @Description:
 */
@EnableBinding(Sink.class)
public class IReceiverImpl implements IReceiver {

    @Value("${server.port}")
    private String port;

    @StreamListener(Sink.INPUT)
    @Override
    public void receiver(Message message) {
        System.out.println("***  "+ message.getPayload() + "  port: "+port);
    }
}
