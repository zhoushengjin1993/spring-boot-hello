package com.sabchow.mybatis.entity;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.sabchow.validation.constraints.ContentLength;

public class SysUser implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4115211129325297429L;
	private Long userId;
	@NotNull(message = "姓名不能为空！")
	private String userName;
	@NotNull(message = "密码不能为空！")
	@ContentLength(message = "密码长度不能小于6位或者不能大于18位")
	private String password;
	@Length(min = 1, max = 8)
	private String addr;
	private String email;
	// private SysRole role;
	private List<SysRole> roleList;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// public SysRole getRole() {
	// return role;
	// }
	//
	// public void setRole(SysRole role) {
	// this.role = role;
	// }

	public List<SysRole> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<SysRole> roleList) {
		this.roleList = roleList;
	}

}
