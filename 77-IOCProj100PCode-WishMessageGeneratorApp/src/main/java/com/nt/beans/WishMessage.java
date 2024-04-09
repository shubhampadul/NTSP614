package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("wmg")
//@Scope("prototype")
@Lazy(true)
public class WishMessage {
	@Autowired
	@Qualifier("createDate2")
	private Date date;
	
	public WishMessage() {
		System.out.println("WishMessage 0- param constructor");
		}
	
	public String generateWishMessage(String user) {
		System.out.println("WishMessage.generateWishMessage()");
		int hour=0;
		hour=date.getHours();
		if(hour<12) 
			return "Good Morning "+user;
		else if(hour<16)
			return "Good AfterNoon "+user;
		else if(hour<20)
			return "Good Evening "+user;
		else
			return "Good Night "+user;
	}//method
}//class