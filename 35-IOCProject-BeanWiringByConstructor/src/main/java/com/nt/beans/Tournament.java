package com.nt.beans;

import java.util.Calendar;

public class Tournament {
	private Events event1;
	
	
	
	public Tournament(Events event1) {
		System.out.println("Tournament.1-param Tournament()");
		this.event1 = event1;
	}
	
	public Tournament() {
		System.out.println("Tournament class 0-param contstuctor");
	}
	
	public Tournament(Calendar cal,Events event1) {
		System.out.println("Tournament.2+param Tournament()");
		this.event1 = event1;
	}
	
	/*
	 * public Tournament(Events event1,Calendar cal) {
	 * System.out.println("Tournament.2-param Tournament()"); this.event1 = event1;
	 * }
	 * 
	 * 
	 * public Tournament(Events event1,int x) {
	 * System.out.println("Tournament.2-param Tournament()"); this.event1 = event1;
	 * } public void setEvent1(Events event1) {
	 * System.out.println("Tournament.setEvent1()"); this.event1 = event1; }
	 */
	
	@Override
	public String toString() {
		return "Tournament [event1=" + event1 + "]";
	}
	
}
