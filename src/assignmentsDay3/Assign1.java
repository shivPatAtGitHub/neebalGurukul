package assignmentsDay3;

import java.util.Scanner;


public class Assign1 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=4; j>=i; j--) {
				System.out.print("  ");
			}
			
			for(int j=1; j>=1; j--) {
				System.out.print("1 ");	
			}
			
			for(int j=i; j>1; j--) {
				System.out.print("  ");				
			}
			
			for(int j=i-1; j>1; j--) {
				System.out.print("  ");				
			}
			
			for(int j=i; j>=i; j--) {
				if (i==1) {
					continue;
				}
				System.out.print("1 ");					
			}
			
			System.out.println();
		}
		
		
		
		
		
	}

}
