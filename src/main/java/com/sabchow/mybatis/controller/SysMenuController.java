package com.sabchow.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sabchow.common.entity.SabJsonResult;
import com.sabchow.mybatis.entity.SysMenu;
import com.sabchow.mybatis.param.SysMenuParam;
import com.sabchow.mybatis.service.SysMenuService;

@RestController
@RequestMapping("/sysMenu")
public class SysMenuController {

	@Autowired
	private SysMenuService sysMenuService;

	@RequestMapping("/querySysMenuList")
	public SabJsonResult<SysMenu> querySysMenuList(@RequestBody SysMenuParam param) {
		SabJsonResult<SysMenu> result = sysMenuService.querySysMenuList(param);
		return result;
	}

	// @RequestMapping("/findUserByUserId")
	// public SabJsonResult<SysUser> findUserByUserId(@RequestBody SysUserParam
	// param) {
	// return sysUserService.findUserByUserId(param.getUserId());
	// }
}
