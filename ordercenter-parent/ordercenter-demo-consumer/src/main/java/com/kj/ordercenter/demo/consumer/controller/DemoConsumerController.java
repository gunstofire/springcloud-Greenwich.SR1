package com.kj.ordercenter.demo.consumer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kj.ordercenter.common.core.entity.DemoEntity;
import com.kj.ordercenter.demo.consumer.protocol.feign.ProviderInvokerService;
import com.kj.ordercenter.demo.consumer.service.ConsumerService;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("consumer")
public class DemoConsumerController {

    
    @Autowired
    ConsumerService consumerService;
    
    @Autowired
    ProviderInvokerService providerInvokerService;
    
    @ApiOperation(value="消费者测试", notes="消费者测试接口")
    @ApiImplicitParams({ 
            @ApiImplicitParam(name = "test", value = "test", required = false, paramType = "query")
    })
    @RequestMapping(value = "demoinfo",method = RequestMethod.GET)
    public String demoInfo() {
        DemoEntity entity = new DemoEntity(1,"mytest","测试数据");
        //本地方法调用
        consumerService.testConsumer();
        
        //远程调用
        String result = providerInvokerService.sayHello(entity.getName());
//        String result = entity.getName();
        return "方法调用demoinfo:"+"获取生产者信息:"+result;
    }
}
