package com.gurukul.day6;

public class ArraySwapSmallBig {

	public static void main(String[] args) {
		int a[] = {10, 11, 12, 20, 21, 22};
		
		//output a[] = {23, 11, 12, 20, 21, 10}
		int t = 0;
		int n = a.length;
//		System.out.print(n);
		
		int small = a[0];
//		System.out.println(small);
		int big = a[0];
//		System.out.println(big);
		int sIndex = 0;
		int bIndex = 0;

		for(int i=0; i<n; i++) {			
				
			if(a[i] < small) {
				small = a[i];	
				sIndex = i;
			}
			
					
					
			if(a[i] > big) {
				big = a[i];
				bIndex = i;	
			}
		}
		
		t = a[sIndex];
		a[sIndex] = a[bIndex];
		a[bIndex] = t;
//		System.out.println(small);
//		System.out.println(big);
		
		for(int i=0; i < n; i++) {
			System.out.print(a[i]+" ");
		}		

	}
}
