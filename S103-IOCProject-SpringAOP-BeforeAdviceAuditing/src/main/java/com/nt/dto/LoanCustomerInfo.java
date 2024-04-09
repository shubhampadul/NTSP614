package com.nt.dto;

import lombok.Data;

@Data
public class LoanCustomerInfo {
	private String custName;
	private Double loanAmount;
	private String purpose;
	private String clerkName;
	private String managerName;
}