package com.gurukul.day2;


import java.util.Scanner;

public class LoopTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int base = sc.nextInt();
		int power = sc.nextInt();
		int total = 1;
		
		for(int i=1; i<=power; i++) {
			total = total * base;
		}
	System.out.println(total);
	}
}
