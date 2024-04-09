package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("wDao")
public class WithdrawDaoImpl implements WithdrawDao{
	public static final String WITHDRAW_QUERY="UPDATE DTX_ACCOUNT_DTLS SET BALANCE=BALANCE-? WHERE ACC_NO=?";
	@Autowired
	JdbcTemplate oraJt;
	public int withdraw(int accNo, float amt) {
		int count=0;
		count=oraJt.update(WITHDRAW_QUERY, amt,accNo);
		return count;
	}
}
