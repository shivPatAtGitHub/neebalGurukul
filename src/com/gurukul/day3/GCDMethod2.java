package com.gurukul.day3;
import java.util.Scanner;
public class GCDMethod2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = 0;
		
		while(x%y != 0) {
			z = x % y;
			if(z == 0) {
				break;
			}
			x = y;
			y = z;
		}
		System.out.println(y);
	}

}
