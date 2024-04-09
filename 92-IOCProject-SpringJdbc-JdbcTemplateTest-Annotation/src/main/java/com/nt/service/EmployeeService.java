package com.nt.service;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
	
	//get all employee count
	int getEmpsTotal();
	Map<String,Object> fetchEmpByNo(Integer no);
	List<Map<String,Object>> fetchEmpByDesg(String desg);
	String fetchEmpNameByNo(Integer no);
	int fetchEmpSalByNo(Integer no);
	Integer hikeEmpSal(Integer no,Integer percentage);
	String registerEmp(String name,String job,int sal);
	String removeEmp(int no);
}
