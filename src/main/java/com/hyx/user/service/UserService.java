package com.hyx.user.service;

import com.hyx.user.bean.User;
import com.hyx.user.dao.UserDao;

import org.springframework.security.core.session.SessionRegistry;
import org.springframework.stereotype.Service;


@Service
public class UserService {

	private SessionRegistry sessionRegistry;
	private UserDao userDao;

	public User getById(Integer  id) {
		User user = userDao.getById(id);
		return user;
	}
	

}