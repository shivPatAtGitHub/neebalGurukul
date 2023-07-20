package com.gurukul.day3;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sum = 0;
		
		while(n != 0) {
			
			sum = (sum * 10) + (n % 10); 
			n = n/10;
		}
		
		System.out.print(sum);
	}

}
