package com.nt.dao;
/*SQL> desc student2;
Name                                      Null?    Type
----------------------------------------- -------- ----------------------------
SNO                                                NUMBER(10)
SNAME                                              VARCHAR2(20)
SADDRS                                             VARCHAR2(20)
TOTAL                                              NUMBER(10)
AVG                                                NUMBER(10)
RESULT                                             VARCHAR2(5)*/

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.bo.StudentBo;

@Repository("stDAO")
public class StudentDaoImpl implements StudentDao{
	private static String INSERT_STUDENT_INFO="INSERT INTO STUDENT2 VALUES(sno_seq.nextval,?,?,?,?,?)";
	@Autowired
	private DataSource ds   =null;
	
	
	@Override
	public int insert(StudentBo bo) throws Exception {
		Connection con   =null;
		PreparedStatement ps=null;
		int         count =0;
		
		//get pooled jdbc con objet from jdbc con pool
			con=ds.getConnection();
			//create PreparedStatement object
			if(con!=null)
				ps=con.prepareStatement(INSERT_STUDENT_INFO);
			
			//set query param values
			if(ps!=null)
				
			
			ps.setString(1, bo.getSname());
			ps.setString(2, bo.getSaddrs());
			ps.setInt(3, bo.getTotal());
			ps.setDouble(4, bo.getAvg());
			ps.setString(5, bo.getResult());
			
		   //execute the query
			count=ps.executeUpdate();
			ps.close();
			con.close();
			return count;
	}//method
}//class
