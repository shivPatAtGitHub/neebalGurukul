package assignmentsDay2;

import java.util.Scanner;

public class Assign5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		
		int zeroth = 0;
		int first = 1;
		System.out.println(zeroth);
		System.out.println(first);
		
		int count = 0;
		for(int i=1; i<100; i++) {
			int fib = zeroth + first;
			if (fib % 2 == 0) {
				System.out.println(fib);
				count++;
			}
			if (count == 10) {
				break;
			}
			zeroth = first;
			first = fib;
		}
		
	}

}
