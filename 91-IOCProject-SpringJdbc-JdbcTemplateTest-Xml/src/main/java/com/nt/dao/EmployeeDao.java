package com.nt.dao;

import java.util.List;
import java.util.Map;

public interface EmployeeDao {
	int getEmpsCount();
	Map<String,Object> getEmpByNo(Integer no);
	List<Map<String,Object>> getEmpByDesg(String desg);
	String getEmpNameByNo(Integer no);
	int getSalary(Integer no);
	int updateSalary(Integer no,Integer newSal);
	int insertEmpRecord(String name,String job,int sal);
	int deleteEmpRecord(int no);
}