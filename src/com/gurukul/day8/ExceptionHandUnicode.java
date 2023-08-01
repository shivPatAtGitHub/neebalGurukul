package com.gurukul.day8;

public class ExceptionHandUnicode {

	
	public static boolean find(int Uni) throws Exception {
		if (Character.isAlphabetic(Uni))
			return true;
		else 
			if (Character.isDigit(Uni))
			return false;
		
		throw new Exception();
	}
	
	public String toString(int Uni) {
		return " ";
	}
	
	
	public static void main(String[] args) throws Exception{
		
//		int Unicode = sc.nextInt();
		int Unicode = 54;
		
		
		try {
			if (find(Unicode))
				System.out.println("Alphabet");				
			else 
				System.out.println("Digit");			
		} catch (Exception e) {			
			System.out.println("Special Character");						
		}
			
		
		
		
		
		
	}

}
