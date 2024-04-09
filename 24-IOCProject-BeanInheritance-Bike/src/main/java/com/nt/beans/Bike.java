package com.nt.beans;

public class Bike {
	private String regNo;
	private String company;
	private String modelName;
	private int    engineNo;
	private String color;
	private String ownerName;
	private int    tankCapacity;
	private String engineCC;
	
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public void setEngineNo(int engineNo) {
		this.engineNo = engineNo;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public void setTankCapacity(int tankCapacity) {
		this.tankCapacity = tankCapacity;
	}
	public void setEngineCC(String engineCC) {
		this.engineCC = engineCC;
	}
	@Override
	public String toString() {
		return "Bike [regNo=" + regNo + ", company=" + company + ", modelName=" + modelName + ", engineNo=" + engineNo
				+ ", color=" + color + ", ownerName=" + ownerName + ", tankCapacity=" + tankCapacity + ", engineCC="
				+ engineCC + "]";
	}
	
	
	
	
 
}
