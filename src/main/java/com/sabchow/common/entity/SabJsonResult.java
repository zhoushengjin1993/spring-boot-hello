package com.sabchow.common.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

public class SabJsonResult<T> implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1018401713760930558L;

	// 请求结果：成功/失败
	@JSONField
	private boolean success = true;

	// 请求提示信息
	@JSONField
	private String message = null;

	// 错误码：0=正常
	@JSONField
	private String errorCode = "0";

	@JSONField
	private String requestId = "";

	// 返回的list
	@JSONField
	private List<T> data = new ArrayList<T>();

	public SabJsonResult() {
		// this.requestId = RequestContext.getRequestId();
	}

	public SabJsonResult(List<T> data) {
		// this.requestId = RequestContext.getRequestId();
		this.data = data;
	}

	public SabJsonResult(T data) {
		// this.requestId = RequestContext.getRequestId();
		if (data != null) {
			if (data instanceof List) {
				this.data.addAll((List) data);
			} else {
				this.data.add(data);
			}
		}
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

}
