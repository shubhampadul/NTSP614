package com.nt.bo;

public class EmployeeBO {
	String empName;
	String empAddrs;
	float  basicSal;
	float  grossSal;
	float  netSal;
	
	//one pair of setter and getter method
	
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
	public float getGrossSal() {
		return grossSal;
	}
	public void setGrossSal(float grossSal) {
		this.grossSal = grossSal;
	}
	public float getNetSal() {
		return netSal;
	}
	public void setNetSal(float netSal) {
		this.netSal = netSal;
	}
}
