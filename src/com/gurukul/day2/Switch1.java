package com.gurukul.day2;

import java.util.Scanner;
import java.lang.Math;
public class Switch1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input Option for Area - \nSquare = 1, Triangle = 2, Circle = 3");
		int option = sc.nextInt();
		
		switch(option) { 
			case 1 : 
				System.out.println("Enter Side of the Square: ");
				int side = sc.nextInt();
				System.out.println("Area = " +side * side);
				break;
				
			case 2 : 
				System.out.println("Enter height of the Triangle: ");
				int hgt = sc.nextInt();
				System.out.println("Enter breadth of the Triangle: ");
				int base = sc.nextInt();
				System.out.println("Area = " +(hgt * base) / 2);
				break;
				
			case 3 : 
				System.out.println("Enter Radius of the Circle: ");
				int rad = sc.nextInt();
				System.out.println("Area = " + Math.PI * Math.pow(rad, 2));
				break;
		}			
		
	}
}
