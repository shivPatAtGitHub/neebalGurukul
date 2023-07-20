package com.gurukul.day3;
import java.util.Scanner;
public class OddXCorrespondingY {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int sum = 0;
		while (x!=0) {
			if(x % 2 != 0) {
			
				
				sum = sum + y;
				
				
			}
			    y = Math.multiplyExact(y, 2);
				x = Math.divideExact(x, 2);
			
		}
		
		System.out.println(sum);
		
	}

}
