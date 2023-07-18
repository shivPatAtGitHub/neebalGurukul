package assignmentsDay1;
import java.util.Scanner;
import java.lang.Math;
public class Assign6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int Compare = num;
		
		int dig1 = num%10;
		num = num/10;
		dig1 = (int) Math.pow(dig1, 3);
		
		int dig2 = num%10;
		num = num/10;
		dig2 = (int) Math.pow(dig2, 3);
		
		int dig3 = num%10;
		num = num/10;
		dig3 = (int) Math.pow(dig3, 3);
		
		if ((dig1 + dig2 + dig3) == Compare)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not an Armstrong Number");
		
	}

}
