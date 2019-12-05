package com.sabchow.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.sabchow.ano.RecordOperationLog;

@Aspect
@Component
public class RecordOperationAspect {

	@Pointcut("@annotation(com.sabchow.ano.RecordOperationLog)")
	public void anon() {
	}

	@After("@annotation(anon)")
	public void syscData(JoinPoint joinPoint, RecordOperationLog anon) {
		System.out.println(anon.description());
	}
}
