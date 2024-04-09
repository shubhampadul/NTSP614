package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;
//here strategy design pattern used
@Repository("EmpDao")
@Profile(value= {"uat"})
public class EmployeeDAOImplMySql implements EmployeeDAO {
	private static final String INSERT_EMPLOYEE_QUERY="INSERT INTO EMPLOYEELAYEREDAPP1(empName,empAddrs,basicSal,grossSal,netSal) VALUES(?,?,?,?,?)";
	@Autowired
	private DataSource ds=null;
	
	public int insert(EmployeeBO bo) throws Exception {
		System.out.println("Used Data Source "+ds);
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
