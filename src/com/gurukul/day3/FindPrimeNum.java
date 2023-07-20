package com.gurukul.day3;

import java.util.Scanner;
import java.lang.Math;

public class FindPrimeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
// Find if a Number is Prime or Not
//		int num = sc.nextInt();
//		boolean isPrime = true;
//		for(int i=2; i < num; i++) {
//
//			if(num%i == 0) {
//				isPrime = false;
//				break;
//			}
//		}
//			
//			if(isPrime)
//				System.out.println("Prime");
//			else  
//				System.out.println("Composite");
		
		
		
		
		// Find all Prime Number till 1000
		
		for(int i=2; i<=1000; i++) {			
			boolean isPrime = true;
			for(int j=2; j < Math.sqrt(i); j++) {
				
				if(i%j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime)
				System.out.println(i);	
		}	
					
	}

}
