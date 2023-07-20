package com.gurukul.day3;
import java.util.Scanner;
public class LargestDigitInANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int largest = 0;
		int dig = 0;
		
		while(num != 0) {
			dig = num % 10;
			if(dig > largest) {
				largest = dig;
			}
			num = num/10;
		}
		
		System.out.println(largest);
	}

}
