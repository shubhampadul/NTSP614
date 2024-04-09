package com.nt.java;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateString {

	public static void main(String[] args) {
		String s1="aabcdddb";
		String s2="";
		/*for(int i=0;i<s1.length();i++) {
			if(!s2.contains(String.valueOf(s1.charAt(i)))){
				s2=s2+s1.charAt(i);
			}
		}*/
		System.out.println();
		Set<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s1.length();i++) {
			set.add(s1.charAt(i));
			}
		
		System.out.println(set);
	}

}
