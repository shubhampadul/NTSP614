package com.nt.service;

import java.util.Random;

import com.nt.dto.LoanCustomerInfo;

public class BankLoanApproverServiceImpl implements BankLoanApproverService {
	Integer loanId;

	@Override
	public int generateLoanId(LoanCustomerInfo Linfo) {
		if (Linfo.getPurpose().equalsIgnoreCase("Agri") && (Linfo.getLoanAmount() <= 200000))
			loanId = new Random().nextInt(1000);
		return loanId;
	}

	@Override
	public String apporveLoan(int loanId, LoanCustomerInfo Linfo) {
		String LoanMsg = null;
		if (Linfo.getPurpose().equalsIgnoreCase("vehicle") && Linfo.getLoanAmount() <= 200000)
			LoanMsg=Linfo.getCustName() + " customer loan approved by manager " + Linfo.getManagerName();
			return LoanMsg;
	}
}
