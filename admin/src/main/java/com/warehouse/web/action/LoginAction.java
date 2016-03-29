package com.warehouse.web.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.warehouse.web.entity.User;
import com.warehouse.web.service.UserService;


@Controller
public class LoginAction {
	/**
	 * @param model
	 *            Spring����ʹ��model
	 * @param user
	 *            ��ҳ���е�name���а�
	 * @return ����ʹ�÷���ҳ��name����String����
	 */
	@Autowired
	UserService userService;
	
	@RequestMapping("login")
	public String login(Model model, User user) {
		user.setAge(5);
		/*
		 * UserRole ur = new UserRole(); ur.setUserName("shuhua");
		 * model.addAttribute("ur", ur);
		 */
		user.setPassword("111");
		user.setUserName("С��sdf");
		User dbUser =  userService.selectByPrimaryKey(1);
		return "index";
	}
}
