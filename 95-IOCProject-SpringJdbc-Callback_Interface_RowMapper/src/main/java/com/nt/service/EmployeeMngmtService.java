package com.nt.service;

import org.springframework.stereotype.Service;

import com.nt.dto.EmployeeDto;


public interface EmployeeMngmtService {
	
	EmployeeDto fetchEmpByNo(int empno);
	
}
