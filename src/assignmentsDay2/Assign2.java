package assignmentsDay2;

import java.util.Scanner;

public class Assign2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		x=Math.toRadians(x);
		
		double sum = 0;
		double num = x;
		double deno = 1;

		for(int i=1; i<20; i++) {
			deno = deno*1;
			if(i%2 == 0) {
				sum = sum + num/deno;
				num = -num*x*x;
			}
		}
		System.out.println(sum);
		System.out.println(Math.cos(x));
		
	}

}
