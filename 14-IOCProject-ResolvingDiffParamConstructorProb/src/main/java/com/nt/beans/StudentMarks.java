package com.nt.beans;

public class StudentMarks {
	int    sno;
	String name;
	String addrs;
	
	
	public StudentMarks(int sno, String name, String addrs) {
		System.out.println("StudentMarks 3-param costructor");
		this.sno = sno;
		this.name = name;
		this.addrs = addrs;
	}


	@Override
	public String toString() {
		return "StudentMarks [sno=" + sno + ", name=" + name + ", addrs=" + addrs + "]";
	}
}
