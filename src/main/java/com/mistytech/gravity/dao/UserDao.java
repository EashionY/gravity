package com.mistytech.gravity.dao;

import com.mistytech.gravity.entity.User;

public interface UserDao {

	int save(User user);
	
	int delete(Integer userId);
	
	int update(User user);
	
	User findByUserId(Integer userId);
	
	User findByUsername(String username);
}
