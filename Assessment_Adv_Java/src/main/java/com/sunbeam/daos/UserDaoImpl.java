package com.sunbeam.daos;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunbeam.pojos.User;

@Repository
public class UserDaoImpl {

	private JdbcTemplate jdbcTemplate;
	UserRowMapper userRowMapper = new UserRowMapper();

	public UserDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public User findByEmail(String email) {
		String sql = "select  id, name, email, password, city, cell_no, reg_amount, reg_date, role from vendors where email=?";
				
		UserRowMapper userRowMapper = new UserRowMapper();
				List<User> list = jdbcTemplate.query(sql, userRowMapper,email);
				if(list.isEmpty())
					return null;
				return list.get(0);
	}
	
	public List<User> getVendorsList() {
		String sql = "select * from vendors";
		List<User> list = jdbcTemplate.query(sql, userRowMapper);
		if(list.isEmpty())
			return null;
		return list;
	}

	public List<User> update() {
		String sql = "update vendors set";
		List<User> list = jdbcTemplate.query(sql, userRowMapper);
		if(list.isEmpty())
			return null;
		return list;
	}

	
	
	
}
