package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBo;
abstract


@Repository("empDao")
public class EmployeeDaoImpl implements EmployeeDao {
	public static final String GET_EMP_BY_ID="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";
	
	EmployeeSelector selector;

	@Autowired
	public EmployeeDaoImpl(DataSource ds) {
		System.out.println("EmployeeDaoImpl.EmployeeDaoImpl()");
		selector=new EmployeeSelector(ds, GET_EMP_BY_ID);
	}

	public EmployeeBo getEmpById(int no) {
		EmployeeBo bo=selector.findObject(no);
		return bo;
	}
	
	//inner class for first method
	private class EmployeeSelector extends MappingSqlQuery<EmployeeBo>{
		
		
		//for compiling query for only one time 
		public EmployeeSelector(DataSource ds, String query) {
			super(ds,query);
			super.declareParameter(new SqlParameter(Types.INTEGER));
			super.compile();
			System.out.println("EmployeeDaoImpl.EmployeeSelector.EmployeeSelector()");
		}

		@Override
		protected EmployeeBo mapRow(ResultSet rs, int rowNum) throws SQLException {
			System.out.println("EmployeeDaoImpl.EmployeeSelector.mapRow()");
			EmployeeBo bo=new EmployeeBo();
			bo.setEmpno(rs.getInt(1));
			bo.setEname(rs.getString(2));
			bo.setJob(rs.getString(3));
			bo.setSal(rs.getInt(4));
			return bo;
		}	
	}
}