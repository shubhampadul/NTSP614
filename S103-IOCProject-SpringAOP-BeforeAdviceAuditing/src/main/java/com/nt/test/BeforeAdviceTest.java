package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.dto.LoanCustomerInfo;
import com.nt.service.BankLoanApproverService;
import com.sun.xml.internal.ws.policy.sourcemodel.attach.ExternalAttachmentsUnmarshaller;

public class BeforeAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		BankLoanApproverService proxy = null;
		LoanCustomerInfo Linfo = null;
		int loanId=0;
		// create ioc container
		ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");

		proxy = ctx.getBean("pfb", BankLoanApproverService.class);
		
		
		try {
			Linfo = new LoanCustomerInfo();
			Linfo.setClerkName("Avinash");
			Linfo.setCustName("Shubham");
			Linfo.setLoanAmount(50000.2);
			Linfo.setManagerName("Rajeshwar");
			Linfo.setPurpose("Agri");
			
			//get loanId
			loanId=proxy.generateLoanId(Linfo);

			System.out.println(proxy.generateLoanId(Linfo));
		   // System.out.println(bankServcie.apporveLoan(1595, Linfo));
		} catch (Exception e) {
			e.printStackTrace();
		}
		//close ioc container
		((AbstractApplicationContext) ctx).close();
	}
}