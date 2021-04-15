package com.sy.springcloud.hystrix;

import com.sy.springcloud.service.RemoteClient;
import org.springframework.stereotype.Component;

/**
 * @Auther: lihang
 * @Date: 2021-04-13 17:05
 * @Description:
 */
@Component
public class RemoteHystrix implements RemoteClient {
    @Override
    public String get(String id) {
        return "请求超时了";
    }
}
