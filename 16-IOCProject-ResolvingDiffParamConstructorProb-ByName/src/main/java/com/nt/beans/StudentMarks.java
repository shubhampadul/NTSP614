package com.nt.beans;

public class StudentMarks {
	int m1;
	int m2;
	int m3;
	
	
	public StudentMarks(int m1, int m2, int m3) {
		super();
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}


	@Override
	public String toString() {
		return "StudentMarks [m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + "]";
	}

	
}
