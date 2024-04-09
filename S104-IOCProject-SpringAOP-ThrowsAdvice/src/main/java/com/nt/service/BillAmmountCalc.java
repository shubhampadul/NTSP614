package com.nt.service;

public class BillAmmountCalc {

	public float calcBillAmount(String[] items, Float[] prices) {
		float totalBillAmt = 0;

		if (items == null || prices == null) {
			throw new IllegalArgumentException("Invalid Inputs");
		}
		for (Float price : prices) {
			totalBillAmt = totalBillAmt + price;
		}
		return totalBillAmt;
	}// method
}// class