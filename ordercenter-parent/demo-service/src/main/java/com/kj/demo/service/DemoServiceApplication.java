package com.kj.demo.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 * 
 * @author xiefk
 * @version $Id: DemoServiceApplication.java, v 0.1 2019年7月5日 下午7:30:34 xiefk Exp $
 */
@SpringBootApplication
@EnableEurekaClient
public class DemoServiceApplication 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SpringApplication.run(DemoServiceApplication.class, args);
    }
}
