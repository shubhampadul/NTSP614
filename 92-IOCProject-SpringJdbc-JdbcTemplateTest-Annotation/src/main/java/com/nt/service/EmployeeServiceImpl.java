package com.nt.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.EmployeeDao;

@Service("empService")
public class EmployeeServiceImpl implements EmployeeService {

	// inject employeeDa
	@Autowired
	EmployeeDao empDao;

	

	// get total of all employees
	public int getEmpsTotal() {
		int total = empDao.getEmpsCount();
		return total;
	}

	@Override
	public Map<String, Object> fetchEmpByNo(Integer no) {
		Map<String, Object> map = null;
		map = empDao.getEmpByNo(no);
		return map;
	}

	@Override
	public List<Map<String, Object>> fetchEmpByDesg(String desg) {
		List<Map<String, Object>> list = null;
		list = empDao.getEmpByDesg(desg);
		return list;
	}

	@Override
	public String fetchEmpNameByNo(Integer no) {
		return empDao.getEmpNameByNo(no);
	}

	@Override
	public int fetchEmpSalByNo(Integer no) {
		int sal=0;
		sal=empDao.getSalary(no);
		return sal;
	}

	@Override
	public Integer hikeEmpSal(Integer no, Integer percentage) {
		int sal=0;
		sal=empDao.getSalary(no);
		sal=sal+(sal*percentage/100);
		sal=Math.round(sal);
		return empDao.updateSalary(no, sal);
	}

	@Override
	public String registerEmp(String name, String job, int sal) {
		int count=0;
		count=empDao.insertEmpRecord(name, job, sal);
		if(count==1)
			return "Emp Regisstration sucessful";
		else
			return "Emp Registration failed";
	}

	@Override
	public String removeEmp(int no) {
		int count=0;
		count=empDao.deleteEmpRecord(no);
		if(count==1)
			return no+" Emp Record Deleted";
		else
			return "Deletion Failed";
	}
}