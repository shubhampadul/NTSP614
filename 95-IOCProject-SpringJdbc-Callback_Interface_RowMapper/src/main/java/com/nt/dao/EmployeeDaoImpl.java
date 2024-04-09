package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBo;

@Repository("empDao")
//@Primary
public class EmployeeDaoImpl implements EmployeeDao {
	private static final String GET_EMP_BY_NO = "SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";

	@Autowired
	JdbcTemplate jt;

	@Override
	public EmployeeBo getEmpByNo(int empno) {
		EmployeeBo bo = null;
		bo = jt.queryForObject(GET_EMP_BY_NO, new EmployeeMapper(), empno);
		// returns EmployeeBo object
		return bo;
	}

	class EmployeeMapper implements RowMapper<EmployeeBo> {
		@Override
		public EmployeeBo mapRow(ResultSet rs, int rowNum) throws SQLException {
			EmployeeBo bo = null;

			// create bo object
			bo = new EmployeeBo();

			bo.setEmpid(rs.getInt(1));
			bo.setEname(rs.getString(2));
			bo.setJob(rs.getString(3));
			bo.setSal(rs.getInt(4));
			return bo;
		}
	}
}