package com.sabchow.common.service;

import com.sabchow.common.entity.SabJsonResult;

/**
 * 
 * @author ZSJ
 *
 */
public interface BaseService {

	default SabJsonResult success(String message) {
		SabJsonResult result = new SabJsonResult();
		result.setMessage(message);
		return result;
	}

	default SabJsonResult success(Object object, String message) {
		SabJsonResult result = new SabJsonResult(object);
		result.setMessage(message);
		return result;
	}

	default SabJsonResult success(Object object) {
		SabJsonResult result = new SabJsonResult(object);
		result.setMessage("查询成功！");
		return result;
	}

	default SabJsonResult success(Object object, Integer total) {
		SabJsonResult result = new SabJsonResult(object);
		result.setMessage("查询成功！");
		// result.setTotal(total);
		return result;
	}

	default SabJsonResult success(Object object, Integer total, Boolean end) {
		SabJsonResult result = new SabJsonResult(object);
		result.setMessage("查询成功！");
		// result.setTotal(total);
		// result.setEnd(end);
		return result;
	}

	default SabJsonResult failure(String message) {
		SabJsonResult result = new SabJsonResult();
		result.setSuccess(false);
		result.setMessage(message);
		return result;
	}

	default SabJsonResult failure(String errorCode, String message) {
		SabJsonResult result = new SabJsonResult();
		result.setSuccess(false);
		result.setErrorCode(errorCode);
		result.setMessage(message);
		return result;
	}
}
