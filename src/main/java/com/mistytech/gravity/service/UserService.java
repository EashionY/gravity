package com.mistytech.gravity.service;

import com.mistytech.gravity.entity.User;

public interface UserService {

	boolean regist(User user);
	
	User login(User user);
	
}
