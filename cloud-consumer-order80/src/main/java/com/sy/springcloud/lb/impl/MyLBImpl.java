package com.sy.springcloud.lb.impl;

import com.sy.springcloud.lb.MyLB;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Auther: lihang
 * @Date: 2020-12-07 15:16
 * @Description:
 */
@Component
@Slf4j
public class MyLBImpl implements MyLB {

    private final AtomicInteger current = new AtomicInteger(0);

    private Integer getNext(int size){
        int next ,i;
        do{
            if (current.intValue()+1 > Integer.MAX_VALUE) current.set(0);
             i = current.get();
            next = i % size;
            i = current.get()+1;
            log.info("current "+ current);
        }while (!(current.compareAndSet(current.get(),i)));
        return next;
    }


    @Override
    public ServiceInstance chose(List<ServiceInstance> instances) {
        if (instances==null || instances.size()==0) return null;

        Integer next = getNext(instances.size());
        log.info("next "+ next);
        return instances.get(next);
    }
}
