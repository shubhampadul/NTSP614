package com.nt.service;

import org.springframework.beans.BeanUtils;

import com.nt.bo.EmployeeBO;
import com.nt.bo.StudentBO;
import com.nt.dao.NitDAO;
import com.nt.dto.EmployeeDTO;
import com.nt.dto.StudentDTO;

public abstract class NitService {
    private NitDAO nitDAO;
    int count=0;
	
	public NitService(NitDAO nitDAO) {
		System.out.println("NitServiceImpl.NitServiceImpl()");
		this.nitDAO = nitDAO;
	}
	public  String registerStudent(StudentDTO dto) {
		StudentBO bo=createStudentBO();
		
		//convert bo to dto
		BeanUtils.copyProperties(dto, bo);
		
		//use dao
		count=nitDAO.insertStudent(bo);
		
		if(count==0) {
			return "Student Registration Failed";
		}
		else
			return "Student Registration Succeded";
		
		
	}
	public  String registerEmployee(EmployeeDTO dto) {
       EmployeeBO bo=createEmployeeBO();
		
		//convert bo to dto
		BeanUtils.copyProperties(dto, bo);
		
		//use dao
		count=nitDAO.insertEmployee(bo);
		if(count==0) {
			return "Employee Registration Failed";
		}
		else
			return "Employee Registration Succeded "+bo;
	}
	
	public abstract StudentBO createStudentBO();
	public abstract EmployeeBO createEmployeeBO();
}
