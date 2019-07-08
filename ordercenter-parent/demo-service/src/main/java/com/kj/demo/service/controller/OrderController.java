package com.kj.demo.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kj.demo.service.entity.Order;
import com.kj.demo.service.service.OrderService;
import com.kj.ordercenter.common.core.result.Response;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;
    
    @RequestMapping(value="order",method = RequestMethod.POST)
    public String save(@RequestBody Order order) {
        orderService.insertOrder(order);
        return "success";
    }
    
    @RequestMapping(value="orders",method = RequestMethod.GET)
    public Response<List<Order>> findList() {
        return new Response<List<Order>>(orderService.findOrders());
    }
}
