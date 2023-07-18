package com.gurukul.day1;

import java.util.Scanner;

public class divideLargerBySmaller {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int output;
		
		if(num1 > num2) {
			output = num1/num2;
			System.out.println("Output = " + output);
		} else {
			output = num2/num1;
			System.out.println("Output = " + output);
		}
		
	}

}
