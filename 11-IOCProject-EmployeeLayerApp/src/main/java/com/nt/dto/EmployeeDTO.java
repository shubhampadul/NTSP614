package com.nt.dto;

import java.io.Serializable;

public class EmployeeDTO implements Serializable{
	int empNo;
	String empName;
	String empAddrs;
	float  basicSal;
	
	//setter and getter methods
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
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
