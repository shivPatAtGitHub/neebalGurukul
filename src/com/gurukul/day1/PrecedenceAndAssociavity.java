package com.gurukul.day1;

public class PrecedenceAndAssociavity {

	public static void main(String[] args) {
		
		int x = 7;
		int y = 3;
		
		int sum2 = x * y / 3 + y - 2 / 4 * 3 % x;
		// here 2/4 will be 0 and not 0.5 as 2 and 4 both are integer values
		
		System.out.println("Sum = "+ sum2);
		System.out.println(x + y + " has a sum " + x + y);
		// integer + integer = integer
		// integer + string = string
		
	}

}
