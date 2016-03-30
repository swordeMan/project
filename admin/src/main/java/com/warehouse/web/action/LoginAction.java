package com.warehouse.web.action;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.warehouse.web.dao.UserMapper;
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
	@Autowired
    UserMapper userMapper;
	
	Md5PasswordEncoder md5=new Md5PasswordEncoder();
	
	private static final Log log = 
			LogFactory.getLog(LoginAction.class.getName());
<<<<<<< HEAD
	
	@RequestMapping("index")
	public String index(Model model) {
		log.info(this.getClass()+".index");
		return "view/index";
=======
	
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
	public String register(User user,Model model) {
		return "login/register";
	}
	
	@RequestMapping("submitRegister")
	public String submitRegister(@Valid User user,BindingResult bindingResult,HttpServletRequest request, Model model) {
		if (bindingResult.hasErrors()) {
			return "login/register";
		}
		String confirmPassword = request.getParameter("confirmPassword");
		
		if(userService.confirmPassword(user.getPassword(), confirmPassword)){
			user.setPassword(md5.encodePassword(confirmPassword, "key"));
			userMapper.insert(user);
		}
		return "login/login";
>>>>>>> branch 'master' of https://github.com/swordeMan/project.git
	}
	
	@RequestMapping("login")
	public String login(Model model) {
		return "login/login";
	}
	
	@RequestMapping("register")
	public String register(User user,Model model) {
		return "login/register";
	}
	
	@RequestMapping("submitRegister")
	public String submitRegister(@Valid User user,BindingResult bindingResult,HttpServletRequest request, Model model) {
		if (bindingResult.hasErrors()) {
			return "login/register";
		}
		String confirmPassword = request.getParameter("confirmPassword");
		
		if(userService.confirmPassword(user.getPassword(), confirmPassword)){
			user.setPassword(md5.encodePassword(confirmPassword, "key"));
			userMapper.insert(user);
		}
		return "login/login";
	}
}
