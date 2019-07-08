package com.kj.ordercenter.demo.provider.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kj.ordercenter.demo.provider.entity.TestOrder;

/**
 * 
 * @author xiefk
 * @version $Id: TestOrderMapper.java, v 0.1 2019年7月5日 下午2:16:59 xiefk Exp $
 * DAO MAPPER 接口
 */
@Mapper
public interface TestOrderMapper extends BaseMapper<TestOrder>{

//    int insertOrder(TestOrder order);
//    
//    void updateOrderById(TestOrder order);
//    
//    void deleteOrderById(@Param("id")int id);
    
    List<TestOrder> findOrders();
}
