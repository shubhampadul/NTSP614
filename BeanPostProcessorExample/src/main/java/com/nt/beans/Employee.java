package com.nt.beans;

import com.nt.dto.EmployeeDTO;

public class Employee {
	public Employee() {
		System.out.println("Employee.Employee()");
	}

	public void initBean() {
		System.out.println("Init Bean() for : Employee");
	}

	public EmployeeDTO empReg(EmployeeDTO dto) {
		System.out.println(dto);
		return dto;
	}

	public void destroyBean() {
		System.out.println("destroyBean() for : Employee");
	}
}