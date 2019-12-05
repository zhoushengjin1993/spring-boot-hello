package com.sabchow.mybatis.service;

import com.sabchow.common.entity.SabJsonResult;
import com.sabchow.common.service.BaseService;
import com.sabchow.mybatis.param.SysMenuParam;

public interface SysMenuService extends BaseService {

	SabJsonResult querySysMenuList(SysMenuParam param);
}
