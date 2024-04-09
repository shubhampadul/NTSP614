package com.nt.beans;

public class BankService {
	public float calcInterAmt(float p,float rate,float time) {
		System.out.println("BankService.calcInterAmt()");
		return p*time*rate/100;
	}

}
