package com.gurukul.day9;

public class StrignBufferDemo {

	public static void main(String[] args) {
		String a = "This is an Example This of a String";
		a.toUpperCase();
		System.out.println(a);
		StringBuffer y = new StringBuffer(a);
		String word = "This";
		
		System.out.println(y);
		
		while((y.indexOf(word)) != -1)  {
			y = y.delete(y.indexOf(word), (y.indexOf(word) + word.length()));
		}
		
		
//		y.replace(0, a.length(), word);
		System.out.println(y);
		
	}

}
