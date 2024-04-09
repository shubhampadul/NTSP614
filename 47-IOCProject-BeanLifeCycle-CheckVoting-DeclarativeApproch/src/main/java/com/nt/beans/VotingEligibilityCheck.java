package com.nt.beans;

import java.util.Date;

public class VotingEligibilityCheck {
	private String name;
	private int    age;
	private String addrs;
	private Date   sysdate;
	
	
	public VotingEligibilityCheck(String name, int age, String addrs, Date sysdate) {
		super();
		this.name = name;
		this.age = age;
		this.addrs = addrs;
		this.sysdate = sysdate;
	}


	//setter and getter methods
	
	public void setName(String name) {
		this.name = name;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}


	public VotingEligibilityCheck(Date sysdate) {
		this.sysdate = sysdate;
	}
	
	//custom init() method
	public void check() {
		System.out.println("custom init method check()");
		if(name==null||age<0) {
			throw new IllegalArgumentException("name and age  must be set with values");
		}
	}
	
	public String checkVotingValidity() {
		if(age>=18) {
			return "You are eligible for voting";
		}
		else {
			return "You are not eligible for voting wait "+(18-age)+" years more";
		}
	}
	
	
	//custom distroy() method
	public void myDistroy() {
		System.out.println("custom distroy method myDistroy()");
		name=null;
		age=0;
		addrs=null;
		sysdate=null;
	}


	@Override
	public String toString() {
		return "VotingEligibilityCheck [name=" + name + ", age=" + age + ", addrs=" + addrs + ", sysdate=" + sysdate
				+ "]";
	}
}
