package com.menu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.menu.database.CP;
import com.menu.model.User;

public class UserDao {
	
public static boolean insertUserToDB(User u) {
		
		boolean f=false;
		try {
			Connection con=CP.createc();
			String query="insert into user(firstName, lastName, email, password, phone)values(?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			//set values to parameter
			ps.setString(1, u.getFirstName());
			ps.setString(2, u.getLastName());
			ps.setString(3, u.getEmail());
			ps.setString(4, u.getPassword());
			ps.setString(5, u.getPhone());
			ps.executeUpdate();
			f=true;
			
		}
		catch(Exception e) {
			
		}
		return f;
		
	}

}
