package com.kj.ordercenter.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

/**
 * 
 * @author xiefk
 * @version $Id: AdminApplication.java, v 0.1 2019年7月4日 下午1:37:20 xiefk Exp $
 */
@SpringCloudApplication
@EnableAdminServer
public class AdminApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(AdminApplication.class, args);
    }
}
