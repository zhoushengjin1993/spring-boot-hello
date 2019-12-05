package com.sabchow.utils;

import java.util.concurrent.TimeUnit;

import org.springframework.data.redis.core.RedisTemplate;

/**
 * redis工具类
 * 
 * @author ZSJ
 *
 */
public class SabRedisUtil {

	private RedisTemplate<String, Object> redisTemplate;

	public void setRedisTemplate(RedisTemplate<String, Object> redisTemplate) {
		this.redisTemplate = redisTemplate;
	}

	/**
	 * 指定缓存失效时间
	 * 
	 * @param key：键
	 * @param timeout：失效时间（秒）
	 * @return
	 */
	public boolean expire(String key, long timeout) {
		try {
			if (timeout > 0) {
				redisTemplate.expire(key, timeout, TimeUnit.SECONDS);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
