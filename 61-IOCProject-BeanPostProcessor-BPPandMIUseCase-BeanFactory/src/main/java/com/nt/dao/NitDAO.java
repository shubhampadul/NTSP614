package com.nt.dao;

import com.nt.bo.EmployeeBO;
import com.nt.bo.StudentBO;

public interface NitDAO {
	abstract int insertStudent(StudentBO bo);
	abstract int insertEmployee(EmployeeBO bo);

}
