package com.kj.demo.service.entity;

import java.util.Date;

import lombok.Data;

@Data
public class Order {

    private int id;
    private String orderNum;
    private Date createTm;
    private String orderDesc;
}
