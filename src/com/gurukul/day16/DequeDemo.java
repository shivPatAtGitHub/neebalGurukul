package com.gurukul.day16;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {

	public static void main(String[] args) {
		String a = "nitin";
		
		
		int len = a.length();
		
		
		Deque <Character> deck = new ArrayDeque<>();
		
		for(int i=0; i<len; i++) {
			deck.addLast(a.charAt(i));
			
		}
		
		while(deck.size()>1) {
			if(deck.removeFirst() != deck.removeLast()) {
				break;
			}
		}
		
		if(deck.size() <= 1) 
			System.out.println("Palindrome");
		else 
			System.out.println("not a Palindrome");
		
	}

}
