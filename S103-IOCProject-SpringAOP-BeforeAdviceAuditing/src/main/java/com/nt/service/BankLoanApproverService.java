
package com.nt.service;

import com.nt.dto.LoanCustomerInfo;

public interface BankLoanApproverService {
	public int generateLoanId(LoanCustomerInfo Linfo);
	public String apporveLoan(int loanId,LoanCustomerInfo Linfo);

}
