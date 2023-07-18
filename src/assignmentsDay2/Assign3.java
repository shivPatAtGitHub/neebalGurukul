package assignmentsDay2;

import java.util.Scanner;
import java.lang.Math;

public class Assign3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		
		double deno = 1;
		double sum = 0;
		for(int i = 1; i<= 10; i++) {
			deno = deno *i;
//			System.out.println(deno);
			sum += Math.pow(x, i)/deno;
		}
		
		System.out.println(sum + 1);
		System.out.println(Math.exp(x));
	}

}
