package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {
	Courier courier;
	
	static {
		System.out.println("Flipkart.static block");
	}
	
	public Flipkart(Courier courier) {
		System.out.println("Flipkart. one param constructor");
		this.courier = courier;
	}

	public String shopping(String items[],float prices[]) {
		float billAmt=0.0f;
		int oid=0;
		String msg=null;
		
		
		//generate bill amt
		for(float price:prices)
			billAmt=billAmt+price;
		
		//generate order id
		oid=new Random().nextInt(100000);
		
		//deliver product
		msg=courier.deliver(oid);
		return Arrays.toString(items)+" are ordered having prices ="+Arrays.toString(prices)+"\nTotal bill amount ="+billAmt+"\n deliver status ="+msg;
	
	}

}