package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

@Service("EmpService")
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDAO dao;

	public String registerEmployee(EmployeeDTO dto) throws Exception {
		float grossSal=0f;
		float netSal  =0f;
		int   count   =0;
		
		//calculate grossSal and netSal
		grossSal=dto.getBasicSal()+(dto.getBasicSal()*0.3f);
		netSal=dto.getBasicSal()+(grossSal*0.2f);
		
		//create BO class obje
		EmployeeBO bo=new EmployeeBO();
		bo.setEmpName(dto.getEmpName());
		bo.setEmpAddrs(dto.getEmpAddrs());
		bo.setBasicSal(dto.getBasicSal());
		bo.setGrossSal(grossSal);
		bo.setNetSal(netSal);
		
		//use DAO
		
		count=dao.insert(bo);
		if(count==1)
			return "\n***Employee Registration Succeded***\n"+"Employee Name ::"+dto.getEmpName()+"\nGross Salary  ::"+grossSal+"\nNet Salary    ::"+netSal;
		else
			return "Employee Registration Failed";
	}
}