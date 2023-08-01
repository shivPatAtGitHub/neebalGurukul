package com.gurukul.day8;

import java.util.Scanner;

public class StringSplitReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		
		String x[] = a.split(" ");
		
		for(int i=0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		
		
		for (int i=0; i < x.length/2; i++) {
			String t = x[x.length-1];
			x[x.length-1] = x[i];
			x[i] = t;
		}
		
		System.out.println();
		
		for(int i=0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		
		
	}

}
