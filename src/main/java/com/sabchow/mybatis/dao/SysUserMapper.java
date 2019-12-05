package com.sabchow.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sabchow.mybatis.entity.SysUser;
import com.sabchow.mybatis.param.SysUserParam;

@Mapper
public interface SysUserMapper {

	List<SysUser> querySysUserList(SysUserParam param);

	SysUser findUserByUserId(Long userId);

	int addSysUser(SysUserParam param);
}
