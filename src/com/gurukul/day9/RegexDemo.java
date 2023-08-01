package com.gurukul.day9;

import java.util.regex.*;


public class RegexDemo {

	public static void main(String[] args) {

//		String test1 = "12 True";
//		String test2 = "true";
//		String test3 = "Yes";
//		String test4 = "yes";
//		String test5 = "12 yes True";
		String test6 = "Ram is in a bad mood";
		
//		String regex = "[a-zA-Z0-9]*\\s[t|T]rue|^[y|Y]es";
//		String regex2 = "[a-zA-Z0-9]{3}";
		String regex3 = "^[\\D][a-zA-Z0-9]{3}";
		Pattern Patt = Pattern.compile(regex3);
//		Matcher match = Patt.matcher(test5);
		
		String x[] = test6.split(" ");
		
		
		for(int i=0; i<x.length; i++) {
			Matcher match = Patt.matcher(x[i]);
			if (match.matches())
				System.out.println("Matched");
			else
				System.out.println("Unmatched");
	
		}
	
	}
}
