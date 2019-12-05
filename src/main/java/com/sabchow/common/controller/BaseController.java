package com.sabchow.common.controller;

import com.sabchow.common.entity.SabJsonResult;

public class BaseController {

	protected SabJsonResult errorParam(boolean flag, String message) {
		SabJsonResult result = new SabJsonResult();
		result.setSuccess(flag);
		result.setMessage(message);
		return result;
	}
}
