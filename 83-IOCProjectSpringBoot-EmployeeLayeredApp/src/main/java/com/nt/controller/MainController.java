package com.nt.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeService;
import com.nt.vo.EmployeeVO;

@Component("controller")
public class MainController {
	
	@Autowired
	private EmployeeService service;

	public String processEmployee(EmployeeVO vo)throws Exception {
		EmployeeDTO dto=null;
		String  result=null;
		
		//create dto obj
		dto=new EmployeeDTO();
		
		//convert EmployeeVO clss obj  to EmployeeDTO cls obj
		dto.setEmpName(vo.getEmpName());
		dto.setEmpAddrs(vo.getEmpAdrs());
		dto.setBasicSal(Float.parseFloat(vo.getBasicSal()));
		
		//use service class
		result=service.registerEmployee(dto);
		return result;
	}
}