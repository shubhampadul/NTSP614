package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBo;

@Repository("empDao3")
//@Primary
public class EmployeeDaoImpl3 implements EmployeeDao {
	private static final String GET_EMP_BY_NO = "SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";
	private static final String GET_EMPS_BY_DESG = "SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB IN(?,?,?)";

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
	
	public List<EmployeeBo> getEmpsByDesg(String desg1, String desg2, String desg3) {
		List<EmployeeBo> listBo=null;
		listBo=jt.query(GET_EMPS_BY_DESG,new ResultSetExtractor<List<EmployeeBo>>(){
			public List<EmployeeBo> extractData(ResultSet rs) throws SQLException, DataAccessException {
			 List<EmployeeBo> listBo1=new ArrayList();
			 while(rs.next()) {
		     EmployeeBo bo=new EmployeeBo();
			 bo.setEmpid(rs.getInt(1));
			 bo.setEname(rs.getString(2));
			 bo.setJob(rs.getString(3));
			 bo.setSal(rs.getInt(4));
			 listBo1.add(bo);
			 }//while
			 return listBo1;
			}//extractData()
		}, desg1,desg2,desg3);//queryForObject()
		return listBo;
	}
}