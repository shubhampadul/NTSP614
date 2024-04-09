package com.nt.service;

public interface BankService {
	
	public float calcSimpleInterestAmmount(int pAmt,int rate, int time);
	public float calcCompundInterestAmmount(int pAmt,int rate, int time);

}
