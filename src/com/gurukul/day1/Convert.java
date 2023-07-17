package com.gurukul.day1;

import java.util.Scanner;

public class Convert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double kms = sc.nextDouble();
		
		double mts = kms*1000;
		double cms = mts*100;
		double inch = cms/2.54;
		double feet = inch/12;
		
		System.out.println("meters = " + mts);
		System.out.println("centimeters = " + cms);
		System.out.println("inches = " + inch);
		System.out.println("feets = " + feet);
	}

}
