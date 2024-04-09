package com.nt.beans;

import java.util.Date;

public class Car {
	private String modelname;
	private String regNo;
	private Date   dop;
	
	

	public Car(String modelname, String regNo, Date dop) {
		System.out.println("Car. 3-param Car(---)");
		this.modelname = modelname;
		this.regNo = regNo;
		this.dop = dop;
	}
	@Override
	public String toString() {
		return "Car [modelname=" + modelname + ", regNo=" + regNo + ", dop=" + dop + "]";
	}

}
