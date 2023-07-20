package com.gurukul.day3;

public class Pattern {

	public static void main(String[] args) {
//		for (int i=1; i<=5; i++) {
//			for (int j=1; j<=i; j++) {
//				System.out.print((char)(j+64));
//			}
//			System.out.println();
//		}

//		for (int i=1; i<=5; i++) {
//			for (int j=1; j<=i; j++) {
//				if(j%2!=0) {
//					System.out.print(1);	
//				} else {
//					System.out.print(0);						
//				}
//			}
//			System.out.println();
//		}
		
//		for (int i=1; i<=5; i++) {				
//				for(int j=1; j<=i; j++) {
//					if(i%2==0) 
//						System.out.print("*");
//					else 
//						System.out.print((char)(j+64));
//				}
//				System.out.println();
//			}
	

//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=5-i; j++) {
//				System.out.print(" ");
//			}
//			for(int j=1; j<=i; j++) {
//				System.out.print(j);
//			}
//			
//			System.out.println();
//		}

//		int x=1;
//		for(int i=1; i<=5; i++) {
//			int y=1;
//			for(int j=1; j<=i; j++) {
//				int z=1;
//				System.out.print(x + " " + y + " " + z + "   ");
//				x++; y++; z++;
//			}
//			System.out.println();
//		}
		

//		for(int i=1; i<=4; i++) {
//			for(int j=1; j<=5-i; j++) {
//				System.out.print(" ");
//			}
//			
//			for(int j=1; j<=i; j++) {
//				System.out.print(j);
//			}
//			
//			for(int j=i-1; j>=1; j--) {
//				System.out.print(j);
//			}
//			
//			System.out.println();
//		}
//		
//		for(int i=5; i>=1; i--) {
//			for(int j=1; j<=5-i; j++) {
//				System.out.print(" ");
//			}
//			
//			for(int j=1; j<=i; j++) {
//				System.out.print(j);
//			}
//			
//			for(int j=i-1; j>=1; j--) {
//				System.out.print(j);
//			}
//			
//			System.out.println();
//		}
		

//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print((char)(j+64));
//			}
//			for(int j=1; j<=10-2*i; j++) {
//				System.out.print(" ");
//			}
//			for(int j=i; j>=1; j--) {
//				System.out.print((char)(j+64));
//			}
//			
//			System.out.println();
//		}
		
		
//		for(int i=1; i<=5; i++) {
//			for(int j=6-i; j<=5; j++) {
//				System.out.print(j);
//				
//			}
//			System.out.println();
//		}
		
//		for(int i=1; i<=5; i++) {
//			for(int j=4; j>=i; j--) {
//				System.out.print(" ");
//			}
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			if(i==5) {				
//				for(int j=1; j<=4; j++) {
//					System.out.print("*");				
//				}
//			}				
//			System.out.println();				
//		}
//		
//		for(int i=1; i<=4; i++) {
//			for(int j=1; j<=4; j++) {
//				System.out.print(" ");
//			}
//			for(int j=4; j>=i; j--) {
//				System.out.print("*");
//			}
//			for(int j=1; j<=i; j++) {
//				System.out.print(" ");
//			}
//			
//			System.out.println();
//		}
		
		for(int i=1; i<=4; i++) {
			for(int j=4; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}				
			System.out.println();
		}
		
		for(int i=1; i<=9; i++) {
			System.out.print("*");			
		}
		System.out.println();			
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				System.out.print(" ");
			}
			for(int j=4; j>=i; j--) {
				System.out.print("*");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
	}
}
