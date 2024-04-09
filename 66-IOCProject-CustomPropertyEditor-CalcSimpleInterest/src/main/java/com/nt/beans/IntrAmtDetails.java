package com.nt.beans;



public class IntrAmtDetails {
	private float pamt;
	private float rate;
	private float time;
	
	
	public IntrAmtDetails() {
		System.out.println("IntrAmtDetails 0 param consturctor");
	}
	
	
	public float getPamt() {
		return pamt;
	}


	public void setPamt(float pamt) {
		this.pamt = pamt;
	}


	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public float getTime() {
		return time;
	}
	public void setTime(float time) {
		this.time = time;
	}


	@Override
	public String toString() {
		return "IntrAmtDetails [pamt=" + pamt + ", rate=" + rate + ", time=" + time + "]";
	}
	
	
	
	
}
