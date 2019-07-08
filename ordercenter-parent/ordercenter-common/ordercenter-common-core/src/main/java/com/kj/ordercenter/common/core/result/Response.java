package com.kj.ordercenter.common.core.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * 
 * @author xiefk
 * @version $Id: Response.java, v 0.1 2019年7月5日 下午2:34:31 xiefk Exp $
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Response<T> {

	private int code = 0;

	private String msg = "success";

	private T data;
	
	public Response(T data) {
        super();
        this.data = data;
    }
}
