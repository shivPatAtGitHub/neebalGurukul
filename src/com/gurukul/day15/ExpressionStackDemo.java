package com.gurukul.day15;

import java.util.Stack;


class Expression {
	String exp;
	
	Expression(String exp) {
		this.exp = exp;
	}
	
	String convertPostfix() {
//		"a+(b*c-d/e)/(f+g)";
		String x = exp;
		int len = x.length();
		char b[] = x.toCharArray();
		
		ArrayStack<Character> d = new ArrayStack<>();
		
		String postfix = "";
		
		for(int i=0; i<len; i++) {
			if(pcd(b[i]) == 0) {
				postfix += b[i];
			} else {
				if(d.isEmpty() || pcd(b[i]) > pcd(d.peak()) || b[i] == '(') {
					d.push(b[i]);
				} else {	
					if(b[i] == ')') {
						while((d.peak() != '(')) {
							//if(d.pop() == '(')
								//continue;
							postfix += d.pop();
						}
						d.pop();
					}else if(pcd(b[i]) <= pcd(d.peak())) {
						while(!(d.isEmpty()) && (pcd(b[i]) <= pcd(d.peak()))) {
							postfix += d.pop();
						}
						d.push(b[i]);	
					}
				}
			}
		}
		while(!d.isEmpty())
		postfix += d.pop();
		return postfix;
	}
	
	// pcd = precedance
	int pcd(char op) {
		
		switch(op) {
		case '*':
		case '/':	
		case '%':
			return 3;
		case '+':
		case '-':
			return 2;
		case '(':
		case ')':
			return 1;
		default : return 0;
		}
	}
	
//	static String postfixToInfix(String Post) {
//		
//	}
	
	
}



public class ExpressionStackDemo {

	public static void main(String[] args) {
		String x = "a+(b*c-d/e)/(f+g)";
		
		Expression xx = new Expression(x);
		System.out.println(xx.convertPostfix());
		
	}

}
