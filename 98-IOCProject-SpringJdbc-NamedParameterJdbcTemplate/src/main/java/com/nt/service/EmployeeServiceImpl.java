package com.nt.service;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.EmployeeDao;
@Service("empService")
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao dao;
	
	
	
	@Override
	public Map<String, Object> fetchEmpById(int no) {
		Map<String,Object> map=null;	
		map=dao.getEmpById(no);
		return map;
	}
	
	
	
	
	
}
