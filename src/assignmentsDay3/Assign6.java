package assignmentsDay3;

import java.util.Scanner;

public class Assign6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int start = sc.nextInt(); 
//		int comNum = num;
		int zeroth = 0;
		int first = 1;
		
		int fib = 0;
		int count = 0;
		for(int i=1;;i++) {
			fib = zeroth + first;
			if(fib>=start) {
				System.out.println(fib);
				count++;
			}
			if(count == num) {
				break;
			}
			
			zeroth = first;
			first = fib;
		}
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
