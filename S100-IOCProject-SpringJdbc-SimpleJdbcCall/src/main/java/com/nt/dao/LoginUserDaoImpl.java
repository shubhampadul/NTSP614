package com.nt.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.nt.bo.LoginUserBo;
@Repository("loginDao")
public class LoginUserDaoImpl implements LoginUserDao {
	
	@Autowired
	SimpleJdbcCall sjc;
	
	public Map<String, Object> authonicateUser(LoginUserBo bo) {
		//create map obje for inparam and outParam
		Map<String,Object> paramMap=null,outMap=null;
		paramMap=new HashMap<String, Object>();
		
		paramMap.put("user", bo.getUname());
		paramMap.put("pass", bo.getPwd());
		
		//set proceducer name
		sjc.setProcedureName("P_AUTH");
		outMap=sjc.execute(paramMap);
		return outMap;
	}
}