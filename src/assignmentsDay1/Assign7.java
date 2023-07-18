package assignmentsDay1;

import java.util.Scanner;


public class Assign7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		int ogTime = time;
		int min = time%100;
		
		char ampm;
		if(time > 1200) {
			ampm = 'p';
		} else {
			ampm = 'a';
		}
		
		time = time/100;
		time = time%12;
		
		System.out.println(ogTime + " >>> " + time + ":" + min + ampm+"m");
		
	}

}
