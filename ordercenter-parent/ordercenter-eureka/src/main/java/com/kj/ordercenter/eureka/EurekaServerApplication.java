package com.kj.ordercenter.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * @author xiefk
 * @version $Id: EurekaServerApplication.java, v 0.1 2019年7月3日 下午2:22:57 xiefk Exp $
 * 服务注册中心 eureka
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
