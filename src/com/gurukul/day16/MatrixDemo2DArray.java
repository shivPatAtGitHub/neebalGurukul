package com.gurukul.day16;

public class MatrixDemo2DArray {

	public static void main(String[] args) {
//	int a[][] = {{1,2,3,4}, {5,6,7}, {8,9,10,11}};
	int b[][] = {{7,8,9,10}, {9,11,12,13}, {14,15,16,17}};

	
	//	int sum =0;
//	
//	for(int i=0; i<a.length; i++) {
//		sum = 0;
//		for(int j=0; j<a[i].length; j++) {
//			sum += a[i][j];
//			System.out.print(a[i][j] + " ");
//		}
//		System.out.println(" = " + sum);
//	}

		int min = b[0][0];
		int max = b[0][0];
		int minRow = 0;
		int maxRow = 0;
		
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				if(b[i][j] > max) {
					max = b[i][j];
					maxRow = i;
				}
				
				if(b[i][j] < min) {
					min = b[i][j];
					minRow = i;
				}
				
				
 			}
			
		}
		
//		System.out.println(min);
//		System.out.println(max);
//		
//		System.out.println(minRow);
//		System.out.println(maxRow);
//	
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				System.out.print(b[i][j] + " ");
				}
			System.out.println();
			}
			
		
		
		int temArr[] = b[minRow];
		b[minRow] = b[maxRow];
		b[maxRow] = temArr;
		
		
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				System.out.print(b[i][j] + " ");
				}
			System.out.println();
			}
		
	}

}
