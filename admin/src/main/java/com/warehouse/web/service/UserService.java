package com.warehouse.web.service;

import java.util.List;

import com.warehouse.web.entity.User;

public interface UserService {
	List<User> selectAll();
	User selectByPrimaryKey(Integer id);
}
