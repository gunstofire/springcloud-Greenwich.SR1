package com.kj.ordercenter.demo.provider.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * 
 * @author xiefk
 * @version $Id: OrderVO.java, v 0.1 2019年7月5日 下午2:28:23 xiefk Exp $
 * 返回数据载体
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class OrderVO {
    
    private Integer id;
    private String orderNum;
    private Date createTm;
    private String orderDesc;
}
