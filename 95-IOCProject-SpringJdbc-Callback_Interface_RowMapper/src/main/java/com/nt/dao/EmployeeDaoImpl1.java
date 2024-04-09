package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBo;

@Repository("empDao1")
@Primary
public class EmployeeDaoImpl1 implements EmployeeDao {
	private static final String GET_EMP_BY_NO = "SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";

	public EmployeeDaoImpl1() {
		System.out.println("EmployeeDaoImpl1.EmployeeDaoImpl1()");
	}
	@Autowired
	JdbcTemplate jt;

	@Override
	public EmployeeBo getEmpByNo(int empno) {
		EmployeeBo bo = null;
		bo = jt.queryForObject(GET_EMP_BY_NO, new RowMapper<EmployeeBo>() {

			@Override
			public EmployeeBo mapRow(ResultSet rs, int rowNum) throws SQLException {
				EmployeeBo bo=null;
				bo=new EmployeeBo();
				bo.setEmpid(rs.getInt(1));
				bo.setEname(rs.getString(2));
				bo.setJob(rs.getString(3));
				bo.setSal(rs.getInt(4));
				return bo;
			}
		}, empno);
		// returns EmployeeBo object
		return bo;
	}
}//class