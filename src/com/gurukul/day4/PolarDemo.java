package com.gurukul.day4;
import java.lang.Math;
class Polar{
	private double r;
	private double th;
	
	Polar(){}
	
	Polar(double x, double y){
		r = x;
		th = y;
	}
	

	double getX() {
		return r*Math.cos(Math.toRadians(th));
	}
	double getY() {
		return r*Math.sin(Math.toRadians(th));
	}
	
	public String toString() {
		return r + " " + Math.toDegrees(th);
	}
	public String toString2() {
		return r + " " + th;
	}
	
	void setPolar(double x, double y) {
		r = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		th = Math.atan(y/x);
	}
	
	
	
}


public class PolarDemo {

	public static void main(String[] args) {
		Polar a = new Polar(5, 50);
		Polar b = new Polar(6, 50);
		Polar c = new Polar();
		
		double x = a.getX() + b.getX();
		double y = a.getY() + b.getY();
		
		c.setPolar(x,y);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
