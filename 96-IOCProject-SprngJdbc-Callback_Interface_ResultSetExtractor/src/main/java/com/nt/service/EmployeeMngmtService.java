package com.nt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nt.bo.EmployeeBo;
import com.nt.dto.EmployeeDto;


public interface EmployeeMngmtService {
	
	EmployeeDto fetchEmpByNo(int empno);
	List<EmployeeBo> fetchEmpsByDesg(String desg1,String desg2,String desg3);
	
}
