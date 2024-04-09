package com.nt.service;

public class BankServiceImpl {

	
	public float calcSimpleInterestAmmount(int pAmt, int rate, int time) {
		return (pAmt*rate*time/100);
	}

	
	public float calcCompundInterestAmmount(int pAmt, int rate, int time) {
		return (float)(pAmt*Math.pow(1+rate/100, time));
	}

}
