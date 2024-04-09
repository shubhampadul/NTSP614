package com.nt.dto;

import java.io.Serializable;

public class StudentDto implements Serializable{
	
	private String sname =null;
	private String saddrs=null;
	private int    m1    =0;
	private int    m2    =0;
	private int    m3    =0;
	
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddrs() {
		return saddrs;
	}
	public void setSaddrs(String saddrs) {
		this.saddrs = saddrs;
		
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	

}
