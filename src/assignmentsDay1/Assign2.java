package assignmentsDay1;

import java.util.Scanner;

public class Assign2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int secH, firH;
		
		secH = num % 100;
		
		firH = num / 100;
		
		System.out.println(secH * 100 + firH);		
	}

}
