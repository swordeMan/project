package admin;
import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.warehouse.web.dao.UserMapper;
import com.warehouse.web.entity.User;  

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class MybatisTest {
	
	@Resource
    private UserMapper userMapper;
	
	private static Logger logger = Logger.getLogger(MybatisTest.class);
	@Test(expected =ArithmeticException.class)
	public void divideZero(){
		int n = 2/0;
	}
	@Test
	public void userTest(){
		User user = userMapper.selectByPrimaryKey(1);
		Assert.assertNotNull(user);
	}
}
