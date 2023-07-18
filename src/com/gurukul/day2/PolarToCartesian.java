package com.gurukul.day2;

import java.util.Scanner;
import java.lang.Math;

public class PolarToCartesian {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextInt();
		double theta = sc.nextInt();
		
		double radians = Math.toRadians(theta);
		double x = r * Math.cos(radians);
		double y = r * Math.sin(radians);

		System.out.println("the Cartesian Coordinates are\n" + (x + "," + y));
		
	}

}
