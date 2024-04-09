package com.nt.beans;

import java.util.Calendar;

public class ScheduleReminder {
	Calendar cal;

	public ScheduleReminder(Calendar cal) {
	    System.out.println("ScheduleReminder 1 param constructor");
		this.cal = cal;
	}
	public String reminder() {
		System.out.println("ScheduleReminder.reminder()");
		Calendar sysDate=null;
	    sysDate=sysDate.getInstance();
		
	    if(cal.get(cal.MONTH)==sysDate.get(sysDate.MONTH)&&cal.get(cal.DATE)==sysDate.get(sysDate.DATE))
			return "Today is Someone BirthDay whish him/her";
		else
			return "Today no reminder for you stay relax";
	}

}
