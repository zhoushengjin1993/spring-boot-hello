package com.sabchow.mybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.sabchow.ano.RecordOperationLog;
import com.sabchow.common.entity.SabJsonResult;
import com.sabchow.mybatis.dao.SysUserMapper;
import com.sabchow.mybatis.entity.SysUser;
import com.sabchow.mybatis.param.SysUserParam;
import com.sabchow.mybatis.service.SysUserService;

@Service
public class SysUserServiceImpl implements SysUserService {

	@Autowired
	private SysUserMapper sysUserMapper;

	@Cacheable(value = "querySysUserListCache", key = "'user.querySysUserList'")
	// value属性：表示存入redis库的key
	// key属性:用于指定方法执行返回值的key，该属性是spring用的，不写也有默认值
	@Override
	public SabJsonResult querySysUserList(SysUserParam param) {
		System.out.println("访问数据库查询！");
		List<SysUser> list = sysUserMapper.querySysUserList(param);
		return success(list);
	}

	@Override
	@RecordOperationLog(description = "根据id查看用户")
	public SabJsonResult findUserByUserId(Long userId) {
		SysUser user = sysUserMapper.findUserByUserId(userId);
		return success(user);
	}

	@Override
	@RecordOperationLog(description = "添加用户")
	public SabJsonResult addSysUser(SysUserParam param) {
		int userId = sysUserMapper.addSysUser(param);
		if (userId > 0) {
			return success(param.getUserId());
		}
		return failure("添加失败");
	}

}
