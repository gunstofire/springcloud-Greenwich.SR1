package com.kj.ordercenter.demo.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * 
 * @author xiefk
 * @version $Id: ProviderController.java, v 0.1 2019年7月3日 下午5:32:05 xiefk Exp $
 * demo 模拟服务提供者代码
 */
@RestController
@RequestMapping("provider")
public class ProviderController {

    @Value("${spring.application.name}")
    String appName;
    
    @ApiOperation(value="生产者测试", notes="生产者测试接口")
    @ApiImplicitParams({ 
            @ApiImplicitParam(name = "hello", value = "test", required = false, paramType = "query")
    })
    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String sayHello(@RequestParam String name) {
        System.err.println("sayHello invoked");
        return "hello "+name+"，from "+ appName+ " this is new world";
    }
}
