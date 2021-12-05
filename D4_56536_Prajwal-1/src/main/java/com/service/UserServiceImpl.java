package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDaoImpl;
import com.pojos.User;

@Service
public class UserServiceImpl {

	@Autowired
	private UserDaoImpl uDao;
	public User getUserDetails(String email,String password)
	{
		return uDao.getUserDetails(email, password);
	}
	public List<User> getVendorsList() {
		return uDao.getVendorsList();
	}
	public User getVendorByEmail(String email) {
		return uDao.getVendorByEmail(email);
	}
	public void saveUpdate(User ven) {
		uDao.saveUpdate(ven);
	}
	public void deleteVendor(String email) {
		uDao.deleteVendor(email);
		
	}
	public void addVendor(User ven) {
		uDao.addVendor(ven);
		
	}
	
}
