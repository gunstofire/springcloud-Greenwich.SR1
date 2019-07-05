package com.kj.ordercenter.demo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * @author xiefk
 * @version $Id: DemoConsumerApplication.java, v 0.1 2019年7月3日 下午5:16:54 xiefk Exp $
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//启用服务注册与发现
@EnableDiscoveryClient
//启用feign进行远程调用
@EnableFeignClients
@EnableCircuitBreaker
@EnableSwagger2
public class DemoConsumerApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(DemoConsumerApplication.class, args);
    }
}
