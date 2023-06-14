package com.menu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.menu.database.CP;
import com.menu.model.Reservation;

public class ReservationDao {
		
public static boolean makeReservation(Reservation id) {
		
		boolean f=false;
		try {
			Connection con=CP.createc();
			String query="insert into reservation(name,contact,source,destination)values(?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			//set values to parameter
			ps.setString(1, id.getName() );
			ps.setString(2, id.getContact());
			ps.setString(3, id.getSource());
			ps.setString(4, id.getDestination());
			ps.executeUpdate();
			f=true;
			
		}
		catch(Exception e) {
			
		}
		return f;
		
	}

public static void showAllReservations() {
	boolean f = false;
	try {
		Connection con = CP.createc();
		String query = "select * from reservation";
		Statement st = con.createStatement();
		ResultSet set = st.executeQuery(query);
		
		while(set.next()) {
			int id = set.getInt(1);
			String name = set.getString(2);
			String contact = set.getString(3);
			String source = set.getString(4);
			String destination = set.getString(5);
			
			System.out.println("Name: " + name + " \n Contact: " + contact + " \n Source: " + source + " \n Destination: " + destination);
			System.out.println("----------------------------------------------");
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}

public static boolean deleteReservation(int id) {
	boolean f=false;
	try {
		Connection con=CP.createc();
		String query="delete from reservation where id=?";
		PreparedStatement  ps=con.prepareStatement(query);
		
		ps.setInt(1, id);
		ps.executeUpdate();
		f=true;
	}
	catch(Exception e) {
	}
	return f;	
}







}


