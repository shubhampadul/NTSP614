package com.nt.dao;

import java.util.List;

import com.nt.bo.EmployeeBo;

public interface EmployeeDao {
	EmployeeBo getEmpByNo(int empno);
	List<EmployeeBo> getEmpsByDesg(String desg1,String desg2,String desg3);
}
