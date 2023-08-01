package com.gurukul.day14;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		System.out.println(x);
		
		
		int a;
		
		try {
			System.out.println("Enter an Input");
			a = System.in.read();
			System.out.println("Input was " + a);
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("Error in i/p");
		}
	
	}

}
