package assignmentsDay1;

import java.util.Scanner;

public class Assign3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int days = sc.nextInt();
		
		int yrs = days / 365;
		days = days - (yrs * 365);
		
		int mnth = days / 30;
		days = days - (mnth * 30);
		
		int week = days / 7;
		days = days - (week * 7);
		
		System.out.println(yrs + " years " + mnth + " months " + week + " weeks and " + days +" days");
		
		
	}

}
