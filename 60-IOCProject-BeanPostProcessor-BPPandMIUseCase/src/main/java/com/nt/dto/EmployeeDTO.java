package com.nt.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmployeeDTO extends BaseDTO{
	private String desg;
	private float exp;
	
	public EmployeeDTO() {
		System.out.println("EmployeeDTO.EmployeeDTO()");
	}

	@Override
	public String toString() {
		return "EmployeeDTO "+super.toString()+" [desg=" + desg + ", exp=" + exp + "]";
	}
	

}
