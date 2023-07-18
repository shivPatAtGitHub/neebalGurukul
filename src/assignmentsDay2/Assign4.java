package assignmentsDay2;

import java.util.Scanner;

public class Assign4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter x-axis: ");
		int x = sc.nextInt();
		System.out.println("Enter y-axis: ");
		int y = sc.nextInt();
		
		
		if((x > 0) && (y > 0)) {
			System.out.println("Quadrant 1");
		} 
		else 
		if((x > 0) && (y < 0)) {
			System.out.println("Quadrant 4");
		} 
		else 
		if((x < 0) && (y < 0)) {
			System.out.println("Quadrant 3");
		} 
		else 
		if((x < 0) && (y > 0)) {
			System.out.println("Quadrant 2");
		} 
		else
		if((x==0) && (y!=0)) {
			System.out.println("Y-axix");
		} 
		else					
		if((y==0) && (x!=0)) {
			System.out.println("X-axis");
		} 
		else {						
			System.out.println("Origin");
		}
			
	}

}
