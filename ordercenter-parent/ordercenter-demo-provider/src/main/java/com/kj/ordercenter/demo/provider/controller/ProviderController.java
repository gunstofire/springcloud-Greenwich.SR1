package com.kj.ordercenter.demo.provider.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kj.ordercenter.common.core.result.Response;
import com.kj.ordercenter.demo.provider.entity.TestOrder;
import com.kj.ordercenter.demo.provider.service.TestOrderService;
import com.kj.ordercenter.demo.provider.vo.OrderVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * 
 * @author xiefk
 * @version $Id: ProviderController.java, v 0.1 2019年7月3日 下午5:32:05 xiefk Exp $
 * demo 模拟服务提供者代码
 */
@RestController
@RequestMapping("provider")
@Api(tags = { "demo provider" })
public class ProviderController {

    @Value("${spring.application.name}")
    String appName;
    
    @Autowired
    TestOrderService testOrderService;
    
    @ApiOperation(value="生产者测试", notes="生产者测试接口")
    @ApiImplicitParams({ 
            @ApiImplicitParam(name = "hello", value = "test", required = false, paramType = "query")
    })
    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public Response<String> sayHello(@RequestParam String name) {
        System.err.println("sayHello invoked");
        return new Response<String>("hello "+name+"，from "+ appName+ " this is new world");
    }
    
//    @ApiOperation(value="新增订单测试", notes="生产者测试接口")
//    @ApiImplicitParams({ 
//            @ApiImplicitParam(name = "orderNum", value = "订单号码", required = true, paramType = "body"),
//            @ApiImplicitParam(name = "orderDesc", value = "订单描述", required = true, paramType = "body")
//    })
//    @RequestMapping(value = "order",method = RequestMethod.POST)
//    public Response<Integer> saveOrder(@RequestBody TestOrder testOrder) {
//        return new Response<Integer>(testOrderService.insertOrder(testOrder));
//    }
//    
//    @ApiOperation(value="更新订单测试", notes="生产者测试接口")
//    @ApiImplicitParams({ 
//            @ApiImplicitParam(name = "orderDesc", value = "订单描述", required = true, paramType = "body")
//    })
//    @RequestMapping(value = "order",method = RequestMethod.PUT)
//    public Response<String> updateOrder(@RequestBody TestOrder testOrder) {
//        testOrderService.updateOrderById(testOrder);
//        return new Response<String>("updateOrder "+testOrder.getId() + "success!");
//    }
//    
//    @ApiOperation(value="删除订单测试", notes="生产者测试接口")
//    @ApiImplicitParams({ 
//            @ApiImplicitParam(name = "id", value = "订单id", required = true, paramType = "query"),
//    })
//    @RequestMapping(value = "order/{id}",method = RequestMethod.DELETE)
//    public Response<String> deleteOrder(
//                 @PathVariable(value="id",required=true) Integer id) {
//        testOrderService.deleteOrderById(id);
//        return new Response<String>("deleteOrder "+id + "success!");
//    }
    
    @ApiOperation(value="查询订单测试", notes="生产者测试接口")
    @ApiImplicitParams({ 
    })
    @RequestMapping(value = "order",method = RequestMethod.GET)
    public Response<List<OrderVO>> listOrder() {
        return new Response<>(testOrderService.findOrders());
    }
}
