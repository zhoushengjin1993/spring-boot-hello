package com.sabchow.mybatis.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sabchow.common.controller.BaseController;
import com.sabchow.common.entity.SabJsonResult;
import com.sabchow.mybatis.entity.SysUser;
import com.sabchow.mybatis.param.SysUserParam;
import com.sabchow.mybatis.service.SysUserService;
import com.sabchow.utils.SabRedisUtil;

@RestController
@RequestMapping("/sysUser")
public class SysUserController extends BaseController {

	@Autowired
	private SysUserService sysUserService;
	@Autowired
	private SabRedisUtil sabRedisUtil;

	@RequestMapping("/querySysUserList")
	public SabJsonResult<SysUser> querySysUserList(@RequestBody SysUserParam param) {
		SabJsonResult<SysUser> result = sysUserService.querySysUserList(param);
		sabRedisUtil.set("test", "今晚大老虎");
		Object obj = sabRedisUtil.get("test");
		System.out.println(obj.toString());
		return result;
	}

	@RequestMapping("/addSysUser")
	public SabJsonResult addSysuser(@Valid @RequestBody SysUserParam param, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return errorParam(false, bindingResult.getFieldError().getDefaultMessage());
		}
		return sysUserService.addSysUser(param);
	}

	@RequestMapping("/findUserByUserId")
	public SabJsonResult<SysUser> findUserByUserId(@RequestBody SysUserParam param) {
		return sysUserService.findUserByUserId(param.getUserId());
	}
}
