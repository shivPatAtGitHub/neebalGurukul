package com.gurukul.day1;

import java.util.Scanner;

public class SalarySegregation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sal = sc.nextDouble();
		double takeHome = 0;
		double tax = 0;
		
		if(sal > 1500000) 
			tax = sal * 0.3;
		else 
			if(sal > 1000000) 
				tax = sal * 0.20;
			else 
				if(sal > 750000) 
					tax = sal * 0.10;
				else 
					tax = 0;		
		
		takeHome = sal - tax;
		System.out.println("Take Home Salary = " + takeHome);
		System.out.println("Tax = " + tax);		
		
		
	}
}
