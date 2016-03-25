package com.lee.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lee.ssm.bean.User;
import com.lee.ssm.dao.mapper.UserMapper;
import com.lee.ssm.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Resource
	private UserMapper userMapper;
	
	@Override
	public User findUserById(int id) throws Exception {
		return userMapper.findUserById(id);
	}

	@Override
	public void displayUser() throws Exception {
		
		User u1 = new User("nathan.lee.salvatore", 18, "女");
		userMapper.insertUser(u1);
		
		userMapper.deleteUser(1001);
		
//		int a = 1 / 0;
		
		User u2 = new User("lee", 22, "男");
		u2.setId(16);
		userMapper.updateUser(u2);
		
	}

}
