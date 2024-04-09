package com.nt.beans;

import java.util.Date;

public class PersonProfile {
	private int id;
	private String name;
	private Date dob;
	private Date doj;
	private Date dom;

	public PersonProfile(int id, String name, Date dob, Date doj, Date dom) {
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.doj = doj;
		this.dom = dom;
	}
	
	@Override
	public String toString() {
		return "PersonProfile [id=" + id + ", name=" + name + ", dob=" + dob + ", doj=" + doj + ", dom=" + dom + "]";
	}
	

}
