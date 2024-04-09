package com.nt.beans;

import java.util.Date;

public class ScheduleReminder {
	Date date;

	public ScheduleReminder(Date date) {
	    System.out.println("ScheduleReminder 1 param constructor");
		this.date = date;
	}
	public String reminder() {
		System.out.println("ScheduleReminder.reminder()");
		Date sysDate=new Date();
		if(date.getMonth()==sysDate.getMonth()&&date.getDate()==sysDate.getDate())
			return "Today is Someone BirthDay whish him/her";
		else
			return "Today no reminder for you stay relax";
	}
}