package com.kj.demo.service.service;

import java.util.List;

import com.kj.demo.service.entity.Order;

public interface OrderService {

    void insertOrder(Order order);
    
    List<Order> findOrders();
}
