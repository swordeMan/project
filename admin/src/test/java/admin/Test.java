package admin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.warehouse.web.dao.UserMapper;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
		UserMapper userMapper = (UserMapper) ctx.getBean("userMapper");
		userMapper.selectAll();
	}

}
