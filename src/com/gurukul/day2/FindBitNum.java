package com.gurukul.day2;

import java.util.Scanner;

public class FindBitNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int bitnum = sc.nextInt();
		
		System.out.println(num >> (bitnum-1) & 1); 
		
	}

}
