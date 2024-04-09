package com.nt.bo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StudentBO extends BaseBO{
	private String course;
	private String qulfy;
	
	public StudentBO() {
		System.out.println("StudentBO.StudentBO()");
	}
	@Override
	public String toString() {
		return "StudentBO "+super.toString()+" [course=" + course + ", qulfy=" + qulfy + "]";
	}

}
