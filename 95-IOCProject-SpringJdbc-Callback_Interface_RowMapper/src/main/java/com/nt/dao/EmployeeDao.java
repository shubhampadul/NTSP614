package com.nt.dao;


import com.nt.bo.EmployeeBo;

public interface EmployeeDao {
	EmployeeBo getEmpByNo(int empno);
}