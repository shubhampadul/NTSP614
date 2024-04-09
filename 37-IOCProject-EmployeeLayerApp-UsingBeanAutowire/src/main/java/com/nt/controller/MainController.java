package com.nt.controller;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeService;
import com.nt.vo.EmployeeVO;

public final class MainController {
	private EmployeeService service;
 
	public MainController(EmployeeService service) {
		System.out.println("MainController 1-param constructor");
	     this.service = service;
	}




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
