package com.gurukul.day1;

import java.util.Scanner;
import java.lang.Math;

public class minimumCurrency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		
		int twoTh = num/2000;
		num = num%2000;
		
		int fiveHund = num/500;
		num = num%500;

		int twoHund = num/200;
		num = num%200;
		
		int OneHund = num/100;
		num = num%100;
		
		int fifty = num/50;
		num = num%50;

		int twenty = num/20;
		num = num%20;
		
		int ten = num/10;
		num = num%10;

		int five = num/5;
		num = num%5;
		
		
		System.out.println(twoTh + " X 2000 = " + 2000*twoTh);
		System.out.println(fiveHund + " X 500 = " + 500*fiveHund);
		System.out.println(twoHund + " X 200 = " + 200*twoHund);
		System.out.println(OneHund + " X 100 = " + 100*OneHund);
		System.out.println(fifty + " X 50 = " + 50*fifty);
		System.out.println(twenty + " X 20 = " + 20*twenty);
		System.out.println(ten + " X 10 = " + 10*ten);
		System.out.println(five + " X 5 = " + 5*five);
		
		
	}

}
