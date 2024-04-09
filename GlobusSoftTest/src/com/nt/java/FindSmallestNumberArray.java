package com.nt.java;

import java.util.ArrayList;
import java.util.List;

public class FindSmallestNumberArray {
	public static void main(String[] args) {
		int a[] = { 54, 68, 12, 78, 54, 78, 32, 95, 49, 95 };
		int largest = a[0];
		int secondLargest = a[0];
		int min=a[0];
		int SecondMin=a[0];
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] > largest) {
				secondLargest = largest;
				largest = a[i];
			}
			if(a[i]<min) {
				SecondMin=min;
				min=a[i];
			}
		}
		System.out.println("secondL :" + secondLargest);
		System.out.println("large :" + largest);
		System.out.println("Smallest :"+min);
		System.out.println("Second Smallest :"+SecondMin);
	}
}