package com.sy.springcloud.controller;

import com.sy.cloudapicommons.entity.Payment;
import com.sy.cloudapicommons.entity.CommonResult;
import com.sy.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author:lihang
 * @create:2020-08-23 14:49
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;
    @Value("${server.port}")
    private String port;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping("payment/create")
    public CommonResult create(@RequestBody Payment payment){
        log.info("ID:"+payment.getId()+"");
        log.info("SERIAL:"+payment.getSerial());
        int i = paymentService.create(payment);
        if( i>0 ){
            return new CommonResult(200,"success",i);
        }else {
            return new CommonResult(444,"fail");
        }

    }

    @GetMapping("payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){

        log.info(port +" : getPaymentById...");
        Payment payment = paymentService.getPaymentById(id);
        if(payment!=null){
            return new CommonResult(200,"success:"+port,payment);
        }else {
            return new CommonResult(444,"没有对应的数据:"+port+"-"+id);
        }


    }

    @GetMapping("getDiscoveryClient")
    public Object getDiscoveryClient(){

        List<String> services = discoveryClient.getServices();
        for (String service : services){
            log.info(" *** element: "+ service);
            List<ServiceInstance> instances = discoveryClient.getInstances(service);
            for (ServiceInstance instance : instances){
                log.info("*** "+service.toUpperCase()+" ***");
                log.info(instance.getInstanceId()+"\t"+instance.getHost()+"\t"+instance.getUri()+"\t"+instance.getPort());
            }
        }
        log.info("************************");
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances){
            log.info("*** CLOUD-PAYMENT-SERVICE ***");
            log.info(instance.getInstanceId()+"\t"+instance.getHost()+"\t"+instance.getUri()+"\t"+instance.getPort());
        }
        return discoveryClient;
    }

    @GetMapping("/payment/lb")
    public String lb(){
        return port;
    }

    @GetMapping("/payment/feign/timeout")
    public String timeOut(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return port;
    }

    @GetMapping("/payment/zipkin")
    public String zipkin(){
        return "hello zipkin";
    }
}
