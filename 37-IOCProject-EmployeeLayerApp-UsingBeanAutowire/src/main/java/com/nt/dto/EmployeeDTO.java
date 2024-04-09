package com.nt.dto;

import java.io.Serializable;

public class EmployeeDTO implements Serializable{
	
	String empName;
	String empAddrs;
	float  basicSal;
	
	//setter and getter methods
	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddrs() {
		return empAddrs;
	}
	public void setEmpAddrs(String empAddrs) {
		this.empAddrs = empAddrs;
	}
	public float getBasicSal() {
		return basicSal;
	}
	public void setBasicSal(float basicSal) {
		this.basicSal = basicSal;
	}
	
	
	

}
