package com.warehouse.web.service.imp;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.stereotype.Service;

import com.warehouse.web.dao.UserMapper;
import com.warehouse.web.entity.User;
import com.warehouse.web.service.UserService;

@Service
public class UserServiceImp implements UserService{
	
	private static final Log log = 
			LogFactory.getLog(UserServiceImp.class);

	@Autowired
    private UserMapper userMapper;
	
	Md5PasswordEncoder md5=new Md5PasswordEncoder();

	@Override
	public List<User> selectAll() {
		System.out.println("imp可以用");
		return userMapper.selectAll();
		
	}

	@Override
	public User selectByPrimaryKey(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public boolean confirmPassword(String firstPassword, String confirmPassword) {
		if(confirmPassword==null){
			log.error("密码为null", new NullPointerException());
		}else{
			return firstPassword.equals(confirmPassword);
		}
		return false;
	}

}
