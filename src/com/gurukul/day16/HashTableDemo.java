package com.gurukul.day16;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		int a = 3450;
		
		Hashtable<Integer, String> hash = new Hashtable<>();
		
		hash.put(0, "Zero");
		hash.put(1, "One");
		hash.put(2, "Two");
		hash.put(3, "Three");
		hash.put(4, "Four");
		hash.put(5, "Five");
		hash.put(6, "Six");
		hash.put(7, "Seven");
		hash.put(8, "Eight");
		hash.put(9, "Nine");
		
		int i=0;
		String x = "";
		
		while(a != 0) {
			int m = a%10;
			x =" " + hash.get(m) + x;
			a/=10;
		}
		
		
		System.out.println(x.trim());
	}

}
