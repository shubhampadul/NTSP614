package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("dDao")
public class DepostieDaoImpl implements DipositeDao{
	public static final String DEPOSITE_QUERY="UPDATE DTX_ACCOUNT_DTLS SET BALANCE=BALANCE+? WHERE ACC_NO=?";
	@Autowired
	JdbcTemplate oraJt;
	
	@Override
	public int deposite(int accNo, float amt) {
		int count=0;
		count=oraJt.update(DEPOSITE_QUERY, amt,accNo);
		return count;
	}
	
}
