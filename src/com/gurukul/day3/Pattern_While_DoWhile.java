package com.gurukul.day3;

public class Pattern_While_DoWhile {

	public static void main(String[] args) {
		int i = 1;
		while(i<=5) {
			int j = 4;
			while(j>=i) {
				System.out.print("  ");
				j--;
			} int k = i;
			while(k >= 1) {
				System.out.print(k + " ");
				k--;
			}
			int l=2;
			while(l<=i) {
				System.out.print(l + " ");
				l++;				
			}
			
			i++;
			System.out.println();
		}
		
		
		
	}

}
