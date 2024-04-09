package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBo;

@Repository("empDao2")
@Primary
public class EmployeeDaoImpl2 implements EmployeeDao {
	private static final String GET_EMP_BY_NO = "SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";

	public EmployeeDaoImpl2() {
		System.out.println("EmployeeDaoImpl1.EmployeeDaoImpl1()");
	}
	@Autowired
	JdbcTemplate jt;

	@Override
	public EmployeeBo getEmpByNo(int empno) {
		// TODO Auto-generated method stub
		return null;
	}

	//by using lambda expression
	
	/*
	@Override
	public EmployeeBo getEmpByNo(int empno) {
		EmployeeBo bo=null;
		bo = jt.queryForObject(GET_EMP_BY_NO,RowMapper<EmployeeBo> rs->{
			bo=new EmployeeBo();
			
		},empno);
		// returns EmployeeBo object
		return bo;
	}*/
}