package com.gurukul.day6;

public class ArrayDemo {

	public static void main(String[] args) {
		int a[] = {10, 11, 12, 20, 21, 22, 23};
		
		//output a[] = {21, 22, 23, 20, 10, 11, 12}
		int t = 0;
		int n = a.length;
//		System.out.print(n);
		
//		for(int i = 0, j = n/2 + 1; i < n/2; i++, j++) {
//			t = a[i];
//			a[i] = a[j];
//			a[j] = t;
//		}	

		for(int i = 0; i < n/2 + 1; i++) {
			t = a[i];
			a[i] = a[n/2+i];
			a[n/2+i] = t;
		}	
			
		for(int i=0; i < n; i++) {
			System.out.print(a[i]+" ");
		}		
			
	}

}
