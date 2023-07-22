package com.gurukul.day5;


abstract class Shape{
	double x;
	double y;
	
	
	Shape() {
		
	}
	
	Shape(double x, double y) {
		this.x = x;
		this.y = y;				
	}
 	
	void set(double x, double y) {
		this.y = x;
		this.x = y;
	}
	
	abstract double area();
	public String toString() {
		return x + " " + y;
	}
	
}

class Rect extends Shape {
	
	Rect (double x, double y) {
		super(x,y);
	}
	
	double area() {
		return x * y;
	}
		
}

class Tri extends Shape {
	double area() {
		return x * y / 2;
	}
}


public class ShapeDemo {

	public static void main(String[] args) {
		Shape a; // = new Shape();
		
//		a.set(2, 3);
//		double ar = a.area();
//		System.out.println("Area " + ar);
		Rect  r = new Rect(4, 5);
		r.set(6, 7);
		
		double ar = r.area();
		System.out.println("area " + ar); //42
		
		Tri t = new Tri();		
		t.set(16, 17);
		ar = t.area();
		System.out.println("area " + ar); //136
		
		a = t;
		a.set(20, 30);
		ar = a.area();
		System.out.println("area " + ar); //300
		
		a=r;
		a.set(6, 60);
		ar=a.area();
		System.out.println("area " + ar); //360

		ar=r.area();
		System.out.println("area " + ar); //360		
	}

}
