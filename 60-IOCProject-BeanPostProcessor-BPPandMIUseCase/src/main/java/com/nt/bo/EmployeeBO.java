package com.nt.bo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
public class EmployeeBO extends BaseBO{
	private String desg;
	private float exp;
	
	public EmployeeBO() {
		System.out.println("EmployeeBO -0 param constructor");
	}

	@Override
	public String toString() {
		return "EmployeeBO [desg=" + desg + ", exp=" + exp + "]";
	}

	
}
