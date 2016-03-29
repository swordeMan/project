package com.warehouse.web.action;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	private static final Log log = 
			LogFactory.getLog(LoginAction.class.getName());
	
	@RequestMapping("index")
	public String index(Model model) {
		log.info(this.getClass()+".index");
		return "view/index";
	}
	
	@RequestMapping("login")
	public String login(Model model) {
		return "login/login";
	}
	
	@RequestMapping("register")
	public String register(Model model) {
		return "login/register";
	}
}
