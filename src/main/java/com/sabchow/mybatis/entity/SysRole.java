package com.sabchow.mybatis.entity;

import java.io.Serializable;

public class SysRole implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3290289726106821622L;

	private Long roleId;
	private String roleName;
	private Integer status;

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
