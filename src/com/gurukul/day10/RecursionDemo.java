package com.gurukul.day10;




public class RecursionDemo {

	static int cVowel(String x) {
		if(x == "") {
			return 0;
		} else {
			char ch =x.charAt(0);
			if(ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u') {
				return 1 + cVowel(x.substring(1));
			} else {
				
				return cVowel(x.substring(1));
			}
		}
	}
	
	
	static int Prod(int x, int y) {
		if(x == 0) {
			return 0;
		} else {
			if(x%2 != 0) {
				return y + Prod(x/2, y*2);				
			} else {
				return Prod(x/2, y*2);
			}
		}
	}
	
	static String bin(int x) {
		if (x==0 || x==1) {
			return x + "";
		} else {
			return bin(x/2) + x%2;
		}
		
	}
	
	
	static String Reverse(int x) {
		if(x/10 == 0) {
			return x + "";
		} else {
			return x % 10 + Reverse(x/10);
		}
		
		
	}
	
	static int max(int x) {
		if(x/10 == 0) {
			return x;
		} else {
			int a = x%10;
			int b = x/10;
			if(a>max(b)) {
				return a;
			} else {
				return max(b);
			}			
		}
	}
	
	static int gcd(int x, int y) {
		if(x==y) {
			return x;
		} else 
			if(x>y) {
			return gcd(x-y, y);
		} else {			
			return gcd(x, y-x);
		}
		
	}
	
	static int Power(int x, int raise) {
		if(raise==0) {
			return 1;
		}
		return x * Power(x, raise-1);
	}
	
	static int fact(int x) {
		if(x==0) {
			return 1;
		}
		return x * fact(x-1);
	}
	
	static int Sum(int x) {
		if(x==0) {
			return 0;
		}
		return x + Sum(x-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// sumFirstNNumbers
		int n = 5;
		int sum = 0;
		sum = Sum(n);
		System.out.println(sum);

		// factorial
		int fact = 1;
		fact = fact(n);
		System.out.println(fact);
		
		// power function
		int n2 = 2;
		int r = 5;
		int pow = 1;
		pow = Power(n2, r);
		System.out.println(pow);
		
		// GCD
		int n3 = 175;
		int n4 = 125;

		int greatestCommonDivisor = gcd(n3, n4);
		System.out.println(greatestCommonDivisor);

		// Max Number
		int n5 = 8549;
		int maxNum = max(n5);
		System.out.println(maxNum);
		
		
		// Reverse Number
		int n6 = 8549;
		String Rev = Reverse(n6);
		System.out.println(Rev);

		// Binary of 18
		int n7 = 18;
		String binary = bin(n7);
		System.out.println(binary);
		
		int n8 = 19;
		int n9 = 10;
		int Product = Prod(n8, n9);
		System.out.println(Product);
		
		String a = "This is a Sample Text";
		int cVow = cVowel(a);
		System.out.print(cVow);
		
		
	}

}
