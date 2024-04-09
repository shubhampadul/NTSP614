package com.nt.dao;

import com.nt.bo.EmployeeBO;
import com.nt.bo.StudentBO;

public class NitDAOImpl implements NitDAO {
	
	public NitDAOImpl() {
		System.out.println("NitDAOImpl.NitDAOImpl()");
	}
	@Override
	public int insertStudent(StudentBO bo) {
		System.out.println("NitDAOImpl.insertStudent()");
		System.out.println(bo);
		return 1;
	}
	@Override
	public int insertEmployee(EmployeeBO bo) {
		System.out.println("NitDAOImpl.insertEmployee()");
		System.out.println(bo);
		return 1;
	}
}