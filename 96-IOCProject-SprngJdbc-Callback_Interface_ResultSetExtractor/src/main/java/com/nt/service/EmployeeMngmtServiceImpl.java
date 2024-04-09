package com.nt.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.EmployeeBo;
import com.nt.dao.EmployeeDao;
import com.nt.dto.EmployeeDto;

@Service("empService")
public class EmployeeMngmtServiceImpl implements EmployeeMngmtService {
	@Autowired
	EmployeeDao dao = null;

	public EmployeeDto fetchEmpByNo(int empno) {
		EmployeeDto dto = null;
		EmployeeBo bo = null;

		// get EmployeeBo object
		bo = dao.getEmpByNo(empno);

		// convert bo to dto
		dto = new EmployeeDto();
		dto.setEmpid(bo.getEmpid());
		dto.setEname(bo.getEname());
		dto.setJob(bo.getJob());
		dto.setSal(bo.getSal());

		// coping bo to dto
		// BeanUtils.copyProperties(bo, dto);

		return dto;
	}

	public List<EmployeeBo> fetchEmpsByDesg(String desg1, String desg2, String desg3) {
		List<EmployeeBo> listBo=null;
		listBo=dao.getEmpsByDesg(desg1, desg2, desg3);
		return listBo;
	}
}