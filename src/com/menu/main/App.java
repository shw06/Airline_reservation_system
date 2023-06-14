package com.menu.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.menu.dao.ReservationDao;
import com.menu.dao.UserDao;
import com.menu.model.Reservation;
import com.menu.model.User;

public class App {
	
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Scanner=next()/nextLine()
		System.out.println("Hello,Please enter your name: \n");
		String user = br.readLine();
		System.out.println("Welcome to Airline Reservation Portal." + user);
		
		
		
		while(true) {
			System.out.println("PRESS 1 to Register");
			System.out.println("PRESS 2 to Make Reservation");
			System.out.println("PRESS 3 to View reservation");
			System.out.println("PRESS 4 to Cancel Reservationt");
			System.out.println("PRESS 5 to EXIT App");
			
			int c = Integer.parseInt(br.readLine());
			
			if(c==1) {
				// register
				System.out.println("Enter your first name: ");
				String firstName=br.readLine();
				System.out.println("Enter your last name: ");
				String lastName=br.readLine();
				System.out.println("Enter your email: ");
				String email=br.readLine();
				System.out.println("Enter your password: ");
				String password=br.readLine();
				System.out.println("Enter your contact number: ");
				String contact=br.readLine();
				
				//create object
				
				User u =new User(firstName,lastName,email,password,contact);
				boolean ans=UserDao.insertUserToDB(u);
				if(ans) {
					System.out.println("User registered successfully....");
					System.out.println("User record: " + u);
				}else {
					System.out.println("Some error occured while registering. Please try again...");
				}	
			}
			else if(c == 2) {
				//make reservation
				System.out.println("Enter your name: ");
				String name=br.readLine();
				System.out.println("Enter your contact: ");
				String contact=br.readLine();
				System.out.println("Enter source: ");
				String source=br.readLine();
				System.out.println("Enter your destination: ");
				String destination=br.readLine();
				
				Reservation r=new Reservation(name,contact,source,destination);
				boolean ans=ReservationDao.makeReservation(r);
				if(ans) {
					System.out.println("Reservation successful.");
					System.out.println("Reservation record."+ r);	
				}else {
					System.out.println("Some error occured while registering. Please try again...");
				}			
			}  
			else if(c == 3) {
				//Display reservation
				ReservationDao.showAllReservations();;
			}
			else if(c == 4) {
				//Delete reservation
				System.out.println("Enter reservation id to cancel: ");
				int id = Integer.parseInt(br.readLine());
				boolean f = ReservationDao.deleteReservation(id);
				if(f) {
					System.out.println("Reservation of id " + id + " Record Deleted... ");
				}
				else {
					System.out.println("Something Went Wrong.. Please try Again!");
				}
			}
			else if(c == 5) {
				//Exit
				
				System.out.println("Thank You For Using Application...If You Enjoyed, Please Experience It Again!" + user);
				break;
			}
					
	}
}
}