package com.gurukul.day16;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		
		HashSet<Integer> x = new HashSet<>(); 
		x.add(1);
		x.add(2);
		x.add(3);
		x.add(4);
		x.add(5);
		x.add(6);
		x.add(7);

		HashSet<Integer> y = new HashSet<>(); 
		y.add(1);
		y.add(3);
		y.add(5);
		y.add(7);
		y.add(9);
		y.add(11);
		y.add(13);
		
		HashSet<Integer> z = new HashSet<>(); 
		z.add(1);
		z.add(2);
		z.add(3);
		z.add(5);
		z.add(7);
		z.add(11);
		z.add(13);
		z.add(23);
	
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println();
		
		x.retainAll(y);
		System.out.println("XnY: "+x);
		System.out.println("Y: " + y);
		System.out.println();

		
		x.retainAll(z);
		System.out.println("(XnY)nZ: " + x);
		System.out.println("Z: " + z);
		
		
	}

}
