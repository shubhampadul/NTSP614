package com.nt.propeditors;

import java.beans.PropertyEditorSupport;

import com.nt.beans.IntrAmtDetails;

public class CustomIntrAmtDetailsEditor extends PropertyEditorSupport {
	
	public CustomIntrAmtDetailsEditor() {
		System.out.println("CustomIntrAmtDetilsEditor 0 param constructor ");
	}
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		System.out.println("CustomIntrAmtDetailsEditor.setAsText()");
		//text=10000,2,10
		int pamt=0;
		int rate=0;
		int time=0;
		IntrAmtDetails details=null;
		String[] s1=null;
		
		
		s1=text.split(",");
		
		pamt=Integer.parseInt(s1[0]);
		rate=Integer.parseInt(s1[1]);
		time=Integer.parseInt(s1[2]);
		
		//create object of IntrAmtDetails
		details=new IntrAmtDetails();
		details.setPamt(pamt);
		details.setRate(rate);
		details.setTime(time);
		
		//setValues
		setValue(details);
	
	}//method
}//class
