package com.warehouse.web.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.warehouse.web.entity.User;

@Controller
public class LoginAction {
	/**
	 * @param model
	 *            Spring建议使用model
	 * @param user
	 *            与页面中的name进行绑定
	 * @return 建议使用返回页面name，即String类型
	 */
	@RequestMapping("login")
	public String login(Model model, User user) {
		user.setAge(5);
		/*
		 * UserRole ur = new UserRole(); ur.setUserName("shuhua");
		 * model.addAttribute("ur", ur);
		 */
		user.setPassword("111");
		user.setUserName("下滑");
		return "jsp/index";
	}
}

