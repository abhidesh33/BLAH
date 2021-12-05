package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pojos.User;
import com.rowmapper.UserRowMapperImpl;

@Repository
public class UserDaoImpl {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private UserRowMapperImpl UserMapper;
	
	public  UserDaoImpl(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate=jdbcTemplate;
	}
	
	public User getUserDetails(String email,String password)
	{
		String sql="select * from vendors where email=? and password=?";
		List<User> userList=jdbcTemplate.query(sql,UserMapper,email,password);
		if(userList.isEmpty())
			return null;
		return userList.get(0);
	}

	public List<User> getVendorsList() {
		String sql="select * from vendors where role='vendor'";
		List<User> vList=jdbcTemplate.query(sql,UserMapper);
		if(vList.isEmpty())
			return null;
		return vList;
	}

	public User getVendorByEmail(String email) {
		String sql="select * from vendors where email=?";
		List<User>vendor=jdbcTemplate.query(sql,UserMapper,email);
		if(vendor.isEmpty())
			return null;
		else
			return vendor.get(0);
	}

	public void saveUpdate(User ven) {
		String sql="update vendors set name=? ,city=?,reg_amount=?, reg_date=?,role=? where email=?";
		jdbcTemplate.update(sql,ven.getName(),ven.getCity(),ven.getReg_amount(),ven.getReg_date(),ven.getRole(),ven.getEmail());
		
	}

	public void deleteVendor(String email) {
		String sql="delete from vendors where email=?";
		jdbcTemplate.update(sql,email);
		
	}

	public void addVendor(User ven) {
		String sql="insert into vendors values(default,?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql,ven.getName(),ven.getEmail(),ven.getPassword(),ven.getCity(),ven.getCell_no(),ven.getReg_amount(),ven.getReg_date(),ven.getRole());
		
	}
}
