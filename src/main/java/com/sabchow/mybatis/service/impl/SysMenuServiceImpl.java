package com.sabchow.mybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sabchow.common.entity.SabJsonResult;
import com.sabchow.mybatis.dao.SysMenuMapper;
import com.sabchow.mybatis.entity.SysMenu;
import com.sabchow.mybatis.param.SysMenuParam;
import com.sabchow.mybatis.service.SysMenuService;

@Service
public class SysMenuServiceImpl implements SysMenuService {

	@Autowired
	private SysMenuMapper sysMenuMapper;

	@Override
	public SabJsonResult querySysMenuList(SysMenuParam param) {
		List<SysMenu> menuList = sysMenuMapper.queryAllSysMenuList();
		return success(menuList);
	}

}
