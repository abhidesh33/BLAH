package com.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.pojos.User;

@Component
public class UserRowMapperImpl implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user=new User();
		user.setId(rs.getInt("id"));
		user.setName(rs.getString("name"));
		user.setEmail(rs.getString("email"));
		user.setPassword(rs.getString("password"));
		user.setCity(rs.getString("city"));
		user.setCell_no(rs.getString("cell_no"));
		user.setReg_amount(rs.getDouble("reg_amount"));
		user.setReg_date(rs.getDate("reg_date"));
		user.setRole(rs.getString("role"));
		return user;
	}

}
