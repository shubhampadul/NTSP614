package com.nt.service;

public class BankServiceImpl implements BankService {

	@Override
	public float calcSimpleInterestAmmount(int pAmt, int rate, int time) {
		return (pAmt*rate*time/100);
	}

	@Override
	public float calcCompundInterestAmmount(int pAmt, int rate, int time) {
		return (float)(pAmt*Math.pow(1+rate/100, time));
	}

}
