package com.nt.test;

public class FlipCart {
	
	Courier courier;
	
	public void setCourier(Courier courier){
		this.courier=courier;
	}
	public void Shoping(String items[],float prices[]) {
		System.out.println("Shoping related logic");
		
		courier.deliver(10);
	}
}