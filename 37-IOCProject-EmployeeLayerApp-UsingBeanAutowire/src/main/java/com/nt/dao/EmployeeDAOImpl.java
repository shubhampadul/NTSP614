package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;
//here strategy design pattern used
public final class EmployeeDAOImpl implements EmployeeDAO {
	private static final String INSERT_EMPLOYEE_QUERY="INSERT INTO EMPLOYEELAYEREDAPP1 VALUES(emp_seq.nextval,?,?,?,?,?)";
	private DataSource ds=null;
	
	public EmployeeDAOImpl(DataSource ds) {
		System.out.println("EmployeeDAOImpl 1-param constructor");
		this.ds=ds;
	}

	public int insert(EmployeeBO bo) throws Exception {
		Connection       con=null;
		PreparedStatement ps=null;
		int             count=0;
		
		//create jdbc pooled connection
		if(ds!=null)
		con=ds.getConnection();
		
		//create preparedStatement obj
		if(con!=null)
		ps=con.prepareStatement(INSERT_EMPLOYEE_QUERY);
		
		//set query param values
		//convert EmployeeBo to prepareStatement
		ps.setString(1,bo.getEmpName());
		ps.setString(2, bo.getEmpAddrs());
		ps.setFloat(3, bo.getBasicSal());
		ps.setFloat(4, bo.getGrossSal());
		ps.setFloat(5, bo.getNetSal());
		
		//execute the query
		count=ps.executeUpdate();
		return count;
	}

}
