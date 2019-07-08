package com.kj.ordercenter.demo.provider.entity;

import java.sql.Date;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 
 * @author xiefk
 * @version $Id: TestOrder.java, v 0.1 2019年7月5日 下午2:14:15 xiefk Exp $
 * lombok使用，不需要getset
 */
@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TestOrder extends Model<TestOrder> {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String orderNum;
    private Date createTm;
    private String orderDesc;
}
