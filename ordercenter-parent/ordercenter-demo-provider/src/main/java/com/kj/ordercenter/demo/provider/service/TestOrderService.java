package com.kj.ordercenter.demo.provider.service;

import java.util.List;

import com.kj.ordercenter.demo.provider.entity.TestOrder;
import com.kj.ordercenter.demo.provider.vo.OrderVO;

/**
 * 
 * @author xiefk
 * @version $Id: TestOrderService.java, v 0.1 2019年7月5日 下午2:17:52 xiefk Exp $
 */
public interface TestOrderService {

//    int insertOrder(TestOrder order);
//    
//    void updateOrderById(TestOrder order);
//    
//    void deleteOrderById(int id);
    
    List<OrderVO> findOrders();
}
