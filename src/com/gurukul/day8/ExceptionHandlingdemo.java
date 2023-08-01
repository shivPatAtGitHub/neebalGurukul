package com.gurukul.day8;

import java.util.Scanner;

public class ExceptionHandlingdemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		// its takes an value and check against first condition of parsing int
		
		try {
			System.out.println(Integer.parseInt(a)); // 1st Condition
		} catch (Exception e) {
			try {
				double b = Double.parseDouble(a);
				System.out.println(e); // 2nd condition
				
			} catch (Exception f) {				
				System.out.println("Invalid");
			}
		}
		
		System.out.println("hello");
		
		
		
	}

}
