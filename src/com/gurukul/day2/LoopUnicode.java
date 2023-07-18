package com.gurukul.day2;

import java.util.Scanner;

public class LoopUnicode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int lower = sc.nextInt();
		int upper = sc.nextInt();
		
		
		for(int i = lower; i <= upper; i++) {
			System.out.println((char)i + " - " + i);
		}
 	}

}
