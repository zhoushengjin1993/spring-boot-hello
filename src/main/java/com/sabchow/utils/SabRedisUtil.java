package com.sabchow.utils;

import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * redis工具类
 * 
 * @author ZSJ
 *
 */
@Component
public class SabRedisUtil {
	// @Autowired //用这个注解，不能指定泛型
	// private RedisTemplate redisTemplate;
	@Resource // 这个注解可以指定泛型
	// https://blog.csdn.net/zhaoheng314/article/details/81564166
	private RedisTemplate<String, Object> redisTemplate;

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

	/**
	 * 根据key获取缓存值
	 * 
	 * @param key
	 * @return
	 */
	public Object get(String key) {
		return key == null ? null : redisTemplate.opsForValue().get(key);
	}

	/**
	 * 92 普通缓存放入 93
	 *
	 * @param key
	 *            键 94
	 * @param value
	 *            值 95
	 * @return true成功 false失败 96
	 */

	public boolean set(String key, Object value) {

		try {

			redisTemplate.opsForValue().set(key, value);

			return true;

		} catch (Exception e) {

			e.printStackTrace();

			return false;

		}

	}
}
