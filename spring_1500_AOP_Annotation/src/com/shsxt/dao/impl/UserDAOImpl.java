package com.shsxt.dao.impl;

import org.springframework.stereotype.Component;

import com.shsxt.dao.UserDAO;
import com.shsxt.model.User;

@Component("u")
public class UserDAOImpl implements UserDAO {

	public void save(User user) {
		// Hibernate
		// JDBC
		// XML
		// NetWork
		System.out.println("user saved!");

	}

}
