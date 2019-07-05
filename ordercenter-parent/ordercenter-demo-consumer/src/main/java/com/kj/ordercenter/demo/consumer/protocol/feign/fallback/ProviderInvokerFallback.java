package com.kj.ordercenter.demo.consumer.protocol.feign.fallback;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.kj.ordercenter.demo.consumer.protocol.feign.ProviderInvokerService;

/**
 * 
 * @author xiefk
 * @version $Id: ProviderInvokerFallback.java, v 0.1 2019年7月4日 上午9:45:06 xiefk Exp $
 * htstrix熔断降级fallback
 */
@Component
public class ProviderInvokerFallback implements ProviderInvokerService{

    public String sayHello(@RequestParam(value = "name") String name) {
        return "sorry "+name+"，service has fail!";
    }

}
