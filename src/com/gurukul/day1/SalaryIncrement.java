package com.gurukul.day1;

import java.util.Scanner;

public class SalaryIncrement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int salary = sc.nextInt();
		
		if(salary < 30000) {
			salary = salary + (salary * 5/100);
		} 
		
		System.out.println("Salary = " + salary);
		
	}

}
