package com.nt.java;

import java.util.Scanner;

public class PrimOrNot {

	public static void main(String[] args) {
		Scanner sc = null;
		int n = 0, m = 0;
		int count = 0;
		// create scanner object
		sc = new Scanner(System.in);
		// read input from user
		System.out.println("enter range of numbers");
		n = sc.nextInt();
		m = sc.nextInt();

		if (n <= 1 || m <= 1) {
			count++;
		}

		for (int j = n; j <= m; j++) {
			for (int i = 2; i < n; i++) {
				if ( n % i == 0) {
					count++;
				}
			}
		}
		if (count == 0) {
			System.out.println(n + " is a prime number");
		} else
			System.out.println(n + " is not prime number");

		sc.close();
	}// main
}// class
