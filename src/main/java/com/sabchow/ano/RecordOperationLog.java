package com.sabchow.ano;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@EnableAspectJAutoProxy
public @interface RecordOperationLog {
	// 业务功能操作描述
	String description();

	// 同步数据的类型，删除、更新、插入
	// SyncType syncType();
}
