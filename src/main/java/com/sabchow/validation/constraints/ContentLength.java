package com.sabchow.validation.constraints;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.sabchow.validation.ContentLengthConstraintValidator;

/**
 * Target —— 表示这个注解可以作用在什么地方，例如作用在方法上，或作用在某个字段上。 Retention
 * —— 被它所注解的注解保留多久，runtime表示不仅被保存到class文件中，jvm加载class文件之后，仍然存在      Constraint
 * —— 表示我们判断逻辑的具体实现类是什么。
 * 
 * @author ZSJ
 *
 */
@Target(value = { ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ContentLengthConstraintValidator.class)
public @interface ContentLength {
	String message();

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
