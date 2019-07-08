package com.kj.demo.service.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kj.demo.service.entity.Order;

@Mapper
public interface OrderMapper {

    int insertOrder(Order order);
    
    List<Order> findOrders();
}
