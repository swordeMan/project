package com.warehouse.web.action;

import javax.annotation.Resource;
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
	 *            Spring����ʹ��model
	 * @param user
	 *            ��ҳ���е�name���а�
	 * @return ����ʹ�÷���ҳ��name����String����
	 */
	@Autowired
	UserService userService;
	@Autowired
    UserMapper userMapper;
	@Autowired
	Md5PasswordEncoder md5;
//	Md5PasswordEncoder md5 = new Md5PasswordEncoder();
	
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
	public String register(User user,Model model) {
		return "login/register";
	}
	
	@RequestMapping("submitRegister")
	public String submitRegister(@Valid User user,BindingResult bindingResult,HttpServletRequest request, Model model) {
		if (bindingResult.hasErrors()) {
			return "login/register";
		}
		String confirmPassword = request.getParameter("confirmPassword");
		/**
		 * �����������ҲӦ�÷���userService�У�
		 * <ul>controller��Ҫ�������ٵ��߼���ָд�����������е����͵Ĵ���</ul>
		 * <li>��request��ȡ����</li>
		 * <li>��ͬ����·��ز�ͬ��view</li>
		 */
		if(userService.confirmPassword(user.getPassword(), confirmPassword)){
			user.setPassword(md5.encodePassword(confirmPassword, "key"));
			userMapper.insert(user);
		}
		return "login/login";
	}
}
