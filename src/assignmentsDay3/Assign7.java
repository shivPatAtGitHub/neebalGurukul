package assignmentsDay3;

import java.util.Scanner;

public class Assign7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int dig = 0;
		int sum = 0;
		while (num!=0) {
			dig = num % 10;
			sum = sum * 10 + dig;
			num = num/10;
		}
//		System.out.println(sum);
		
		while(sum!=0) {
			dig = sum%10;
			sum = sum/10;
//			System.out.println(dig);
			switch(dig) {
			case 1 : System.out.print("One ");
			break;
			case 2 : System.out.print("Two ");
			break;
			case 3 : System.out.print("Three ");
			break;
			case 4 : System.out.print("Four ");
			break;
			case 5 : System.out.print("Five ");
			break;
			case 6 : System.out.print("Six ");
			break;
			case 7 : System.out.print("Seven ");
			break;
			case 8 : System.out.print("Eight ");
			break;
			case 9 : System.out.print("Nine ");
			break;
			case 0 : System.out.print("Zero ");
			break;
			}
			
		}
		
	}

}
