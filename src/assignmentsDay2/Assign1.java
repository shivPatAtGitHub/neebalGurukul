package assignmentsDay2;

import java.util.Scanner;

public class Assign1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius 1:");
		double r1 = sc.nextDouble();
		
		System.out.println("Enter radius 2:");
		double r2 = sc.nextDouble();
		
		System.out.println("Enter theta 1:");
		double th1 = sc.nextDouble();
		th1 = Math.toRadians(th1);
		
		System.out.println("Enter theta 1:");
		double th2 = sc.nextDouble();
		th2 = Math.toRadians(th2);
	
		
//		x1 = r1*cos(th1)
		double x1 = r1* Math.cos(th1);
//		y1 = r1*sin(th1)
		double y1 = r1*Math.sin(th1);
		
		
		
//		x2 = r1*cos(th2)
		double x2 = r2 * Math.cos(th2);
//		y2 = r1*sin(th2)
		double y2 = r2* Math.sin(th2);
		
		double x3 = x1 + x2;
		double y3 = y1 + y2;
		
		double radius = Math.sqrt((x3*x3) + (y3*y3));
		System.out.println(radius);
		double theta = Math.atan(y3/x3);
		theta = Math.toDegrees(theta);
		System.out.println(theta);
		
		
	
	
		
		
	}
	
}
