package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {
	//DTDC dtdc;
	BlueDart bdart;

	static {
		System.out.println("Flipkart.static block");
	}

	
	  public Flipkart(BlueDart bdart) {
	  System.out.println("Flipkart. one param constructor"); 
	  this.bdart = bdart; 
	  }
	 
	/*
	 * public Flipkart(DTDC dtdc) {
	 * System.out.println("Flipkart.Flipkart() constructer"); this.dtdc = dtdc; }
	 */

	public String shopping(String items[], float prices[]) {
		float billAmt = 0.0f;
		int oid = 0;
		String msg = null;

		// generate bill amt
		for (float price : prices)
			billAmt = billAmt + price;

		// generate order id
		oid = new Random().nextInt(100000);

		// deliver product
		msg = bdart.deliver(oid);
		//msg=dtdc.deliver(oid);
		return Arrays.toString(items) + " are orered having prices =" + Arrays.toString(prices)
				+ "\nTotal bill amount =" + billAmt + "\n deliver status =" + msg;

	}

}
