package com.lee.ssm;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lee.ssm.bean.User;
import com.lee.ssm.service.IUserService;

public class UserServiceImplTest {

	private ApplicationContext applicationContext;

	@Before
	public void setUp() throws Exception {

		applicationContext = new ClassPathXmlApplicationContext(new String[] {
				"spring/applicationContext.xml",
				"spring/applicationContext-service.xml",
				"spring/applicationContext-dao.xml",
				"spring/springmvc.xml"
		});
	}

	@Test
	public void testFindUserById() throws Exception {
		IUserService userService = (IUserService) applicationContext.getBean("userService");

		User user = userService.findUserById(10);
		System.out.println(user);
	}
	
	@Test
	public void testDisplayUser() throws Exception {
		IUserService userService = (IUserService) applicationContext.getBean("userService");
		userService.displayUser();
	}
	
}
