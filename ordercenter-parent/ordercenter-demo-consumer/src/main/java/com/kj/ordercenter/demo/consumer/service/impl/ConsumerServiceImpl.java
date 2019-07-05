package com.kj.ordercenter.demo.consumer.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.kj.ordercenter.demo.consumer.controller.DemoConsumerController;
import com.kj.ordercenter.demo.consumer.service.ConsumerService;

/**
 * 
 * @author xiefk
 * @version $Id: ConsumerServiceImpl.java, v 0.1 2019年7月3日 下午7:02:02 xiefk Exp $
 */
@Service
public class ConsumerServiceImpl implements ConsumerService{

    final static Logger LOGGER = LoggerFactory.getLogger(DemoConsumerController.class);
    
    public void testConsumer() {
        LOGGER.info("ConsumerServiceImpl testConsumer : invoked");
//        System.err.println("testConsumer invoked");
    }

}
