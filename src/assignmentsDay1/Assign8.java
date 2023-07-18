package assignmentsDay1;

import java.util.Scanner;

public class Assign8 {

	public static void main(String[] args) {
		System.out.println("Enter Units :");
		Scanner sc = new Scanner(System.in);
		int unit = sc.nextInt();
		int ogUnit = unit;
		System.out.println("Enter Name = ");
		String name = sc.next();
		int charge;
		
		if(unit >= 100) {
			charge = 100 * 4;
			unit = unit - 100;
			
			if(unit >= 200) {
				charge = charge + (200 * 5);
				unit = unit - 200;
				charge = charge + (unit * 10);
			}
		} else {
			charge = unit * 4;
		}
		
		if(charge > 1000) {
			charge = charge + (charge * 5 / 100);
		}
		
		charge = charge + (charge * 18 / 100);
		
		
		System.out.println("Name = " +name);
		System.out.println("Units = " +ogUnit);
		System.out.println("Charge = " +charge);
	}

}
