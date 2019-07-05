package com.kj.ordercenter.demo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * @author xiefk
 * @version $Id: DemoProviderApplication.java, v 0.1 2019年7月3日 下午5:19:15 xiefk Exp $
 * demo 服务提供者启动类
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//启用服务注册与发现
@EnableDiscoveryClient
@EnableSwagger2
public class DemoProviderApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(DemoProviderApplication.class, args);
    }
}
