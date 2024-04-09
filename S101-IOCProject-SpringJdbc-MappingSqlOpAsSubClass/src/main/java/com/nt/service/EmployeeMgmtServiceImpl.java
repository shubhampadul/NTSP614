package com.nt.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.EmployeeBo;
import com.nt.dao.EmployeeDao;
import com.nt.dto.EmployeeDto;

@Service("empService")
public class EmployeeMgmtServiceImpl implements EmployeeMgnmtService {
	
	@Autowired
	EmployeeDao dao;
	
	public EmployeeDto fetchEmpById(int no) {
		EmployeeBo bo=null;
		EmployeeDto dto=null;
		dto=new EmployeeDto();
		bo=dao.getEmpById(no);
		
		//convert dto to bo
		dto.setSrNo(1);
		BeanUtils.copyProperties(bo, dto);
	
		return dto;
	}

}
