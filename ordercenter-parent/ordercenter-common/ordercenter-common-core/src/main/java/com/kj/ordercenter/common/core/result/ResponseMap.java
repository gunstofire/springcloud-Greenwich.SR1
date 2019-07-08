package com.kj.ordercenter.common.core.result;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class ResponseMap<T> {

	private int code = 0;

	private String msg;

	private Map<String,Object> data;
	
	public ResponseMap(Map<String,Object> data) {
        super();
        this.data = data;
    }
}
