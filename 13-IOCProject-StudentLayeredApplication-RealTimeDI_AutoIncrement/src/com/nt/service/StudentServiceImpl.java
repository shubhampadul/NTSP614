
package com.nt.service;

import com.nt.bo.StudentBo;
import com.nt.dao.StudentDao;
import com.nt.dto.StudentDto;

public final class  StudentServiceImpl implements StudentService{
	private StudentDao dao;
	
	
	public StudentServiceImpl(StudentDao dao) {
		this.dao = dao;
	}
	
	
	@Override
	public String generateResult(StudentDto dto) throws Exception {
		//b logic
				int    total  =0;
				double avg    =0.0d;
				String result =null;
				int    count  =0;
				
				total=dto.getM1()+dto.getM2()+dto.getM3();
				avg=total/3;
				if(dto.getM1()>=35 && dto.getM2()>=35 && dto.getM3()>=35 && avg>=35)
					 result="Pass";
				else
					 result="Fail";
				
				//create StudentBo class object 
				StudentBo bo=new StudentBo();
				
				bo.setSname(dto.getSname());
				bo.setSaddrs(dto.getSaddrs());
				bo.setTotal(total);
				bo.setAvg(avg);
				bo.setResult(result);
				
				//use Dao
				
				count=dao.insert(bo);
				
				if(count==0)
					return "Student Registration Faild  \t"+"Result ::"+result;
				else
					return "Student Registration Sucessful  \n"+"Result ::"+result;
	}//method
	
}//class