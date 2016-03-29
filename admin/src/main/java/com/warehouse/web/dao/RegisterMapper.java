package com.warehouse.web.dao;

import java.util.List;

import com.warehouse.web.form.RegisterForm;

public interface RegisterMapper {

	int deleteByPrimaryKey(Integer id);

	int insert(RegisterForm record);

	RegisterForm selectByPrimaryKey(Integer id);

	List<RegisterForm> selectAll();

	int updateByPrimaryKey(RegisterForm record);
}