package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository("empDao")
public class EmployeeDaoImpl implements EmployeeDao {
	private static final String GET_EMP_COUNT_QUERY="SELECT COUNT(*) FROM EMP";
	private static final String GET_EMP_BY_NO="SELECT EMPNO,ENAME,SAL,JOB FROM EMP WHERE EMPNO=?";
	private static final String GET_EMP_BY_DESG="SELECT EMPNO,ENAME,SAL,JOB FROM EMP WHERE JOB=?";
	private static final String GET_EMP_NAME_BY_NO="SELECT ENAME FROM EMP WHERE EMPNO=?";
	private static final String GET_EMP_SAL_BY_NO="SELECT SAL FROM EMP WHERE EMPNO=?";
	private static final String UPDATE_EMP_SAL_BY_N0="UPDATE EMP SET SAL=? WHERE EMPNO=?";
	private static final String INSERT_EMP_RECORD="INSERT INTO EMP(EMPNO,ENAME,JOB,SAL)VALUES(EMP_SEQ.NEXTVAL,?,?,?)";
	private static final String DELETE_EMP_RECORD="DELETE FROM EMP WHERE EMPNO=?";
	
	//JdbcTemplate
	@Autowired
	private JdbcTemplate jt;
	
	
	//gets all employee count
	public int getEmpsCount() {
		return jt.queryForObject(GET_EMP_COUNT_QUERY, Integer.class);
	}
	@Override
	public Map<String, Object> getEmpByNo(Integer no) {
		Map<String,Object> map=null;
		map=jt.queryForMap(GET_EMP_BY_NO,no);
		return map;
	}
	@Override
	public List<Map<String, Object>> getEmpByDesg(String desg) {
		List<Map<String,Object>> list=null;
		list=jt.queryForList(GET_EMP_BY_DESG,desg);
		return list;
	}
	@Override
	public String getEmpNameByNo(Integer no) {
		String name=null;
		name=jt.queryForObject(GET_EMP_NAME_BY_NO, String.class,no);
		return name;
	}
	@Override
	public int getSalary(Integer no) {
		int sal=0;
		sal=jt.queryForObject(GET_EMP_SAL_BY_NO, Integer.class, no);
		return sal;
	}
	@Override
	public int updateSalary(Integer no, Integer newSal) {
		return jt.update(UPDATE_EMP_SAL_BY_N0,newSal,no);
	}
	@Override
	public int insertEmpRecord(String name, String job, int sal) {
		return jt.update(INSERT_EMP_RECORD,name,job,sal);
	}
	@Override
	public int deleteEmpRecord(int no) {
		int result=0;
		result=jt.update(DELETE_EMP_RECORD, no);
		return result;
	}
}