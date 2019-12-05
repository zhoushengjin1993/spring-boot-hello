package com.sabchow.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sabchow.mybatis.entity.SysMenu;

@Mapper
public interface SysMenuMapper {

	List<SysMenu> queryAllSysMenuList();
}
