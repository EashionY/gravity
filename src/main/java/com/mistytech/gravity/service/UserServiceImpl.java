package com.mistytech.gravity.service;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mistytech.gravity.dao.UserDao;
import com.mistytech.gravity.entity.User;
import com.mistytech.gravity.exception.DataBaseException;
@Service("userService")
public class UserServiceImpl implements UserService {

	public Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Resource
	private UserDao userDao;
	
	public boolean regist(User user) {
		int i;
		try {
			i = userDao.save(user);
		} catch (Exception e) {
			log.error(e.getMessage());
			throw new DataBaseException("Õ¯¬Á“Ï≥£");
		}
		return i==1;
	}

	public User login(User user) {
		return userDao.findByUsername(user.getUsername());
	}

}
