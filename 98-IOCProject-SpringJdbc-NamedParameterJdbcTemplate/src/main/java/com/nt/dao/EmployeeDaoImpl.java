package com.nt.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository("empDao")
public class EmployeeDaoImpl implements EmployeeDao {
	private static final String GET_EMP_BY_ID="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=:id";
	@Autowired
	NamedParameterJdbcTemplate npjt;
	
	@Override
	public Map<String, Object> getEmpById(int no) {
		Map<String,Object> map=null;
		Map<String,Integer> paramMap=new HashMap();
		paramMap.put("id", no); 
		map=npjt.queryForMap(GET_EMP_BY_ID, paramMap);
		return map;
	}
}