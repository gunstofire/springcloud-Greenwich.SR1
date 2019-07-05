package com.kj.ordercenter.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Hello world!
 *
 */
/**
 * 
 * @author xiefk
 * @version $Id: OrderGatewayApplication.java, v 0.1 2019年7月3日 下午3:13:21 xiefk Exp $
 * 网关服务
 */
@EnableZuulProxy
@SpringCloudApplication
@EnableSwagger2
public class OrderGatewayApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(OrderGatewayApplication.class, args);
    }
}
