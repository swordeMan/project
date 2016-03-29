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
	 *            Spring建议使用model
	 * @param user
	 *            与页面中的name进行绑定
	 * @return 建议使用返回页面name，即String类型
	 */
	@Autowired
	UserService userService;
	
	@RequestMapping("index")
	public String index(Model model) {
		return "view/index";
	}
	
	@RequestMapping("login")
	public String login(Model model) {
		return "login/login";
	}
}
