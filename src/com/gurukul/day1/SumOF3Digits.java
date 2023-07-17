package com.gurukul.day1;

import java.util.Scanner;

public class SumOF3Digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int dig1 = num /100;
		int dig2 = (num/10) % 10;
		int dig3 = num %10;

//		System.out.println("1 = "+ dig1);
//		System.out.println("2 = "+ dig2);
//		System.out.println("3 = "+ dig3);
		
		int sum = dig1 + dig2 + dig3;
		int rev = (dig3 * 100) + (dig2 * 10) + dig1;
		int sumPlusrev = num + rev;
		
		System.out.println("Sum of numbers with 3 digits = "+ sum);
		System.out.println("Reverse of 3 numbers with 3 digits = "+ rev);
		System.out.println("Sum of numbers with 3 digits and its reverse = "+ sumPlusrev);
		
	}

}
