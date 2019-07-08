package com.kj.ordercenter.common.core.result;

import java.util.Collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * 
 * @author xiefk
 * @version $Id: ResponseList.java, v 0.1 2019年7月5日 下午2:34:27 xiefk Exp $
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class ResponseList<T> {

	private int code = 0;

	private String msg;

	private Collection<T> data;
	
	public ResponseList(Collection<T> data) {
        super();
        this.data = data;
    }
}
