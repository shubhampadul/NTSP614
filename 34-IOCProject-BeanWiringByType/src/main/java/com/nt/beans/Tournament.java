package com.nt.beans;

public class Tournament {
	private Events event1;
	
	
	
	public Tournament() {
		System.out.println("Tournament class 0-param contstuctor");
	}
	
	public void setEvent1(Events event1) {
		System.out.println("Tournament.setEvent1()");
		this.event1 = event1;
	}


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		return "Tournament [event1=" + event1 + "]";
	}
	
}
