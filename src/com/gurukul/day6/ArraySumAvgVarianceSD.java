package com.gurukul.day6;

import java.util.Scanner;

public class ArraySumAvgVarianceSD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of element: ");
		int n = sc.nextInt();
		double x[];
		x = new double[n];
		
		double sum = 0;
		
		for(int i=0; i < x.length; i++) {
			x[i] = sc.nextDouble();
			sum += x[i];
		}
		System.out.println("SUM : " + sum);
		
		double avg = sum/n;
		System.out.println("AVG : " + avg);
		
		double variance=0;
		for(int i=0; i<x.length; i++) {
			variance+= (x[i]-avg) * (x[i]-avg);
		}
		
		variance=variance/n;
		System.out.println("Variance : " + variance);

		double SD = Math.sqrt(variance);
		System.out.println("Standard Deviation : " + SD);
		
			
		
	}

}
