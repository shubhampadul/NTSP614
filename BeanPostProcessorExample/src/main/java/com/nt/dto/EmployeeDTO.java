package com.nt.dto;

import java.util.Date;

import lombok.Data;

@Data
public class EmployeeDTO {
	private int id;
	private String firstName;
	private String lastName;
	private Date date;
}
