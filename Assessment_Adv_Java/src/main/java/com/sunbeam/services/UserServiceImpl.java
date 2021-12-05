package com.sunbeam.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import com.sunbeam.daos.UserDaoImpl;
import com.sunbeam.pojos.User;

@Service
public class UserServiceImpl {
	@Autowired
	private UserDaoImpl userDao ;
	
public UserServiceImpl(UserDaoImpl userDao) {
	this.userDao= userDao;
}
	
public User findByEmail(String email) {
	return userDao.findByEmail(email);
}

public User authenticateUser(String email, String password) {
	User user = userDao.findByEmail(email);
	
	if(user != null && user.getPassword().equals(password)) {
		return user;
	}
	return null;
}


public List<User> findAllVendors() {
	return userDao.getVendorsList();
}


	
}
