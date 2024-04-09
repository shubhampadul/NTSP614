package com.nt.beans;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("wmg")
//@ComponentScan(basePackages="com.nt.beans")
public class WishMessage {
	
	@Autowired
	Calendar calendar=null;
	
	public String generateWishMsg(String user) {
		int hour=0;
		hour=calendar.get(calendar.HOUR_OF_DAY);
		
		if(hour<12)
			return "Good Morning";
		else if(hour<16)
			return "Good Afternoon";
		else if(hour<20)
			return "Good Evening";
		else
			return "Good Night";
	}
}