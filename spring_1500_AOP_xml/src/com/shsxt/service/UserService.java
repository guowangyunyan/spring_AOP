package com.shsxt.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.shsxt.dao.UserDAO;
import com.shsxt.model.User;

@Component("userService")
public class UserService {
	private UserDAO userDao;

	public void add(User user) {
		userDao.save(user);
	}

	public UserDAO getUserDao() {
		return userDao;
	}

	@Resource
	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	};

}
