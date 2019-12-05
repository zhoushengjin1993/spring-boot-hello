package com.sabchow.mybatis.service;

import com.sabchow.common.entity.SabJsonResult;
import com.sabchow.common.service.BaseService;
import com.sabchow.mybatis.param.SysUserParam;

public interface SysUserService extends BaseService {

	SabJsonResult querySysUserList(SysUserParam param);

	SabJsonResult findUserByUserId(Long userId);

	SabJsonResult addSysUser(SysUserParam param);
}
