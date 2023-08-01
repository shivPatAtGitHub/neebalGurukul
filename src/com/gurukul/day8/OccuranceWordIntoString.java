package com.gurukul.day8;

public class OccuranceWordIntoString {

	public static void main(String[] args) {
		String word = "to";
		String a = "Hello to All of to you to";
		
		int occurance = 0;
		int i=0;
		
		
		// indexOf returns -1 when there is no more occurance
		while((i = a.indexOf(word,i)) != -1) {
			occurance++;
			i++;
		}
		
		
		System.out.println(occurance);
		
		
	}

}
