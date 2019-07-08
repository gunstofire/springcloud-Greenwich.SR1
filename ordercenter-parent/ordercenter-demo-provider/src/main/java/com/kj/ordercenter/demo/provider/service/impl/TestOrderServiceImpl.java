package com.kj.ordercenter.demo.provider.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kj.ordercenter.demo.provider.entity.TestOrder;
import com.kj.ordercenter.demo.provider.mapper.TestOrderMapper;
import com.kj.ordercenter.demo.provider.service.TestOrderService;
import com.kj.ordercenter.demo.provider.vo.OrderVO;

/**
 * 
 * @author xiefk
 * @version $Id: TestOrderServiceImpl.java, v 0.1 2019年7月5日 下午2:19:36 xiefk Exp $
 */
@Service
public class TestOrderServiceImpl extends ServiceImpl<TestOrderMapper, TestOrder> implements TestOrderService{

    @Autowired
    TestOrderMapper testOrderMapper;
    
//    @Override
//    @Transactional(rollbackFor = Exception.class)
//    public int insertOrder(TestOrder order) {
//        return testOrderMapper.insertOrder(order);
//    }
//
//    @Override
//    @Transactional(rollbackFor = Exception.class)
//    public void updateOrderById(TestOrder order) {
//        testOrderMapper.updateOrderById(order);
//    }
//
//    @Override
//    @Transactional(rollbackFor = Exception.class)
//    public void deleteOrderById(int id) {
//        testOrderMapper.deleteOrderById(id);
//    }

    @Override
    public List<OrderVO> findOrders() {
        List<OrderVO> list = new ArrayList<>();
        BeanUtils.copyProperties(testOrderMapper.findOrders(), list);
        return list;
    }

}
