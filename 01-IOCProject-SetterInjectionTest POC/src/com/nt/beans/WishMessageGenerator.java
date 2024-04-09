package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	
	private Date date=null;
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:: no param constructor");
	}
	
	//setter method for setter injection
	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate() method");
		this.date=date; 
	}
	
	//write business logic
	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage() method");
		int hour=0;
		
		//get current hour of the day
		hour=date.getHours(); //24 hours format
		
		//generate wish message
		if(hour<12)
			return "Good Morning "+user;
		else if(hour<17)
			return "Good Afternoon "+user;
		
		else if(hour<21)
			return "Good Evening "+user;
		
		else 
			return "Good Night "+user;
	
	}//method
}//class
