package com.sy.springcloud.service.impl;

import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.core.util.IdUtil;
import com.sy.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

/**
 * @Auther: lihang
 * @Date: 2020-12-09 20:18
 * @Description:
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public String paymentInfo_OK() {
        String result = "*** 线程池 "+Thread.currentThread().getName()+" UUID:"+ IdUtil.simpleUUID();
        return result;
    }

    @Override
    public String paymentInfo_Timeout(int time) {
        ThreadUtil.sleep(time);
        String result = "*** 线程池 "+Thread.currentThread().getName()+" UUID:"+IdUtil.simpleUUID();
        return result;
    }

    @Override
    public String cirCuitBreaker(int id) {

        if(id >= 0 ){
            return " circuitbreaker ok "+ IdUtil.simpleUUID();
        }else {
            throw new RuntimeException("id is zero");
        }
    }
}
