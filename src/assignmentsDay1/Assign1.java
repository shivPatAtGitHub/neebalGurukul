package assignmentsDay1;

import java.util.Scanner;


public class Assign1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int milSec = sc.nextInt();
		
		int hour = milSec/(60 * 60 * 1000);
		milSec = milSec % 3600000;
		
		int min = milSec/(60*1000);
		milSec = milSec % 60000;
		
		int sec = milSec/1000;
		
		System.out.println(hour + ": " + min + ": " + sec);
		
		
		
	}

}
