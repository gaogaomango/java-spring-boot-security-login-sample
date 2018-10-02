package com.example.securitylogin.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.securitylogin.model.AppUser;

public class AppUserMapper implements RowMapper<AppUser> {

	public static final String BASE_SQL = "Select u.User_Id, u.User_name, u.Encryted_password From App_User u";

	private static final String COLUMN_NAME_USER_ID = "User_Id";
	private static final String COLUMN_NAME_USER_NAME = "User_Name";
	private static final String COLUMN_NAME_ENCRYTED_PASSWORD = "Encryted_Password";
	
	@Override
	public AppUser mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Long userId = rs.getLong(COLUMN_NAME_USER_ID);
		String userName = rs.getString(COLUMN_NAME_USER_NAME);
		String encrytedPassword = rs.getString(COLUMN_NAME_ENCRYTED_PASSWORD);
		
		return new AppUser(userId, userName, encrytedPassword);
	}

}
