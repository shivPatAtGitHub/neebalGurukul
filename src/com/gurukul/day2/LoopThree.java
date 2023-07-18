package com.gurukul.day2;

import java.util.Scanner;
import java.lang.Math;

public class LoopThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		
		
		double sum = 0.0;
//		for(double i = 1.0; i<=n; i++) {
//			sum += 1/i;
//		}
		
//		for(double i=1; i<=n; i++) {
//			sum += 1/(i*i);
//		}
		
//		double j = 0;
//		for(double i=1; i<=n; i++, j--) {
//			sum += 1/(j += i * 1);
//		}
//		
//		double j = 1.0;
//		for(double i=1; i<=n; i++) {
//			j *= i;
//			sum += 1.0/j;
//		}
		
//		double nemo = 1.0;
//		double f = 1.0;
//		
//		for(int i=1; i<20; i++) {
//			f = f * i;
//			if(i % 2 != 0) {
//				sum = sum + (nemo/f);
//				nemo = -nemo;
//			}
//		}
		
		double x = 60.0;
		x = Math.toRadians(x);
		
		double f = 1.0;
		
		for(int i=1; i<20; i++) {
			f = f * i;
			if(i % 2 != 0) {
				sum += (Math.pow(x, i))/f;
				x = -x;
			}
		}
		
		System.out.println(sum);
		
	}

}
