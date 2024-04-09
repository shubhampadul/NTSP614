package com.nt.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StudentDTO extends BaseDTO{
	private String course;
	private String qulfy;
	
	public StudentDTO() {
		System.out.println("StudentDTO.StudentDTO()");
	}

	@Override
	public String toString() {
		return "StudentDTO "+super.toString()+" [course=" + course + ", qulfy=" + qulfy + "]";
	}
}