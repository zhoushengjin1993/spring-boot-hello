package com.sabchow.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.sabchow.validation.constraints.ContentLength;

public class ContentLengthConstraintValidator implements ConstraintValidator<ContentLength, Object> {

	@Override
	public void initialize(ContentLength arg0) {
		System.out.println("初始化-----------------");
	}

	@Override
	public boolean isValid(Object obj, ConstraintValidatorContext context) {
		if (obj == null) {
			return false;
		}
		String strValue = (String) obj;
		if (strValue.length() < 6 || strValue.length() > 18) {
			return false;
		}
		return true;
	}

}
