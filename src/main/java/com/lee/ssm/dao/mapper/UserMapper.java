package com.lee.ssm.dao.mapper;

import com.lee.ssm.bean.User;

public interface UserMapper {

	public User findUserById(int id) throws Exception;

	public Integer insertUser(User user) throws Exception;

	public void deleteUser(int id) throws Exception;

	public void updateUser(User user) throws Exception;
}
