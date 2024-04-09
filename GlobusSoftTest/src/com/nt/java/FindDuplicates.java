package com.nt.java;

public class FindDuplicates {

	public static void main(String[] args) {
		String s1 = "rajesjswar";
		String s2 = "";
		String s3="";
		int count=0;

		for (int i = 0; i < s1.length(); i++) {
			
			for (int j = i+1; j < s1.length(); j++) {
				
				if (s1.charAt(i) == s1.charAt(j)) {
					s2 = s2+s1.charAt(j);
					count++;
					
				}
			}
		}
		System.out.println("count : "+count);
		System.out.println("duplicates charcters : "+s2);
		
	}

}
