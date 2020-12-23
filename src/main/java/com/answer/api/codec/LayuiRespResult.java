package com.answer.api.codec;

import java.io.Serializable;

import lombok.Data;

/**
 * @author lz
 */
@Data
public class LayuiRespResult implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	int code;
	
	String msg;
	
	int count;
	
	Object data;
	
	public static LayuiRespResult error(String msg) {
		LayuiRespResult result = new LayuiRespResult();
		result.code = -1;
		result.count = 0;
		result.msg = msg;
		result.data = null;
		return result;
	}
	
	
	public static LayuiRespResult success(Object data,int count) {
		LayuiRespResult result = new LayuiRespResult();
		result.code = 0;
		result.count = count;
		result.msg = "成功";
		result.data = data;
		return result;
	}
	
}
