package com.menu.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	
	static Connection con;
	public static Connection createc() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String user="root";
			String password="6498";
			String url="jdbc:mysql://localhost:3306/airline";
			
			con =DriverManager.getConnection(url,user,password);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
