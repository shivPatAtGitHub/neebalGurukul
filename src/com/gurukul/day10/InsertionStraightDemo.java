package com.gurukul.day10;

public class InsertionStraightDemo {

	public static void main(String[] args) {
		int arr[] = {8, 7, 11, 2, 9, 4};
//		int t,j;
//		for(int i=1; i<arr.length; i++) {
//			t = arr[i];
//			for(j=i; j>0 && arr[j-1] > t; j--) {
//					arr[j] = arr[j-1];
//			}
//			arr[j] = t;
//		}

		int t,j;
		for(int i=1; i<arr.length; i++) {
			t = arr[i];
			for(j=i; j>0 && arr[j-1] > t; j--) {
				arr[j] = arr[j-1];
			}
			arr[j] = t;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}

}
