package com.warehouse.web.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warehouse.web.dao.UserMapper;
import com.warehouse.web.entity.User;
import com.warehouse.web.service.UserService;

@Service
public class UserServiceImp implements UserService{

	@Autowired
    private UserMapper userMapper;

	@Override
	public List<User> selectAll() {
		System.out.println("impø…“‘”√");
		return userMapper.selectAll();
		
	}

	@Override
	public User selectByPrimaryKey(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}

}
