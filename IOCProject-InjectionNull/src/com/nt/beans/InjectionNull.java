package com.nt.beans;

import java.util.Date;

public class InjectionNull {
	private int id;
	private String name;
	
	Date
	private Date doj;
	
	public InjectionNull(int id, String name, Date doj) {
		
		this.id = id;
		this.name = name;
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "InjectionNull [id=" + id + ", name=" + name + ", doj=" + doj + "]";
	}
}
