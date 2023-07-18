package assignmentsDay1;

import java.util.Scanner;
import java.lang.Math;

public class Assign5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
	
		int largest = Math.max(num1, num2);
		largest = Math.max(largest, num3);
		
	System.out.println(largest);
	}
}
