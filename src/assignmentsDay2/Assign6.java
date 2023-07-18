package assignmentsDay2;

import java.util.Scanner;

public class Assign6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int lower = sc.nextInt();
		int upper = sc.nextInt();

		int zeroth = 0;
		int first = 1;
		
		
		
		for(int i=1; i<100; i++) {
			int fib = zeroth + first;
			
			if (fib >= lower && fib <= upper) {
				System.out.println(fib);	
			}
			
			if (fib > upper) {
				break;
			}
			
			zeroth = first;
			first = fib;
		}
		
	}

}
