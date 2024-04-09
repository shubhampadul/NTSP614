package com.nt.controller;

import org.springframework.stereotype.Component;

import com.nt.dto.StudentDto;
import com.nt.service.StudentService;
import com.nt.vo.StudentVo;


@Component("stController")
public class StudentController {
	private StudentService service;

	public StudentController(StudentService service) {
		this.service = service;
	}
	
	public String process(StudentVo vo) throws Exception {
		//convert vo obj to dto obj
		
		StudentDto dto= new StudentDto();
		
		dto.setSname(vo.getSname());
		dto.setSaddrs(vo.getSaddrs());
		dto.setM1(Integer.parseInt(vo.getM1()));
		dto.setM2(Integer.parseInt(vo.getM2()));
		dto.setM3(Integer.parseInt(vo.getM3()));
		
		//use Service class 
		String result=service.generateResult(dto);
		return result;
		
	}//process
}//class