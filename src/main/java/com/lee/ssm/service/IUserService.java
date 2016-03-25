package com.lee.ssm.service;

import com.lee.ssm.bean.User;

public interface IUserService {

	public User findUserById(int id) throws Exception;

	public void displayUser() throws Exception;
	
}
