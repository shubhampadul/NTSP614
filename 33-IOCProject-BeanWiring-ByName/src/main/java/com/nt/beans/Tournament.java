package com.nt.beans;

public class Tournament {
	private Events event1;
	
	private Events event2;
	
	public Tournament() {
		System.out.println("Tournament class 0-param contstuctor");
	}
	
	public void setEvent1(Events event1) {
		System.out.println("Tournament.setEvent1()");
		this.event1 = event1;
	}

	public void setEvent2(Events event2) {
		System.out.println("Tournament.setEvent2()");
		this.event2 = event2;
	}

	@Override
	public String toString() {
		return "Tournament [event1=" + event1 + ",\nTournament [event2=" + event2 + "]";
	}

	

	
	
}
