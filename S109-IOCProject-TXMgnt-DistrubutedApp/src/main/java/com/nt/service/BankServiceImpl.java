package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.DipositeDao;
import com.nt.dao.WithdrawDao;

@Service("bankService")
public class BankServiceImpl implements BankSerivce {
	@Autowired
	DipositeDao dDao;
	@Autowired
	WithdrawDao wDao;
	
	@Override
	public boolean transferMoney(int sourceAcc, int destAcc, float amt) {
		int count1=0,count2=0;
		count1=wDao.withdraw(sourceAcc, amt);
		//call deposit method
		count2=dDao.deposite(destAcc, amt);
		if(count1==0&&count2==0) {
			throw new RuntimeException("Transaction Failed");
		}
		else {
			return true;	
		}
		
	}

}
