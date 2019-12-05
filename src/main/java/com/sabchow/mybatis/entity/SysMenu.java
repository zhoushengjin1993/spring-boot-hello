package com.sabchow.mybatis.entity;

import java.io.Serializable;
import java.util.List;

public class SysMenu implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7952792398922307156L;

	private Long menuId;

	private String menuName;

	private String url;

	private Long parentId;

	private List<SysMenu> childMenu;

	public Long getMenuId() {
		return menuId;
	}

	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}

	public String getMenuNaMe() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public List<SysMenu> getChildMenu() {
		return childMenu;
	}

	public void setChildMenu(List<SysMenu> childMenu) {
		this.childMenu = childMenu;
	}

}
