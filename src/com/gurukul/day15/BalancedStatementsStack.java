package com.gurukul.day15;

//class StackArray{
//	
//}
import java.util.Stack;


public class BalancedStatementsStack {
	
	public static void main(String[] args) {
		
		String  a = "((a+b)) * ((c-d))";
		char b[] = a.toCharArray();
		ArrayStack<Character> c = new ArrayStack<>();
		

			for(int i=0; i<b.length; i++) {				
				if(b[i] == ')') {
					if(!c.isEmpty()) {
						c.pop();						
					} else {
						System.out.println("Unbalanced");
						return;
					}
					
					
				}
				
				if(b[i] == '(') {
					c.push(b[i]);
				}				
			}
		
			
		if(c.isEmpty())
			System.out.println("balanced");
		else
			System.out.println("not balanced");
		
		
	}

}
