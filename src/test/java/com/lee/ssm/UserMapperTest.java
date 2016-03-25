package com.lee.ssm;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lee.ssm.bean.User;
import com.lee.ssm.dao.mapper.UserMapper;

public class UserMapperTest {

	private ApplicationContext applicationContext;

	@Before
	public void setUp() throws Exception {

		applicationContext = new ClassPathXmlApplicationContext(new String[] {
				"spring/applicationContext.xml",
				"spring/applicationContext-dao.xml"

		});
	}

	@Test
	public void testFindUserById() throws Exception {
		// 从spring容器中获取userdao
		UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");

		User user = userMapper.findUserById(10);
		System.out.println(user);
	}

}
