package assignmentsDay8;

public class Q4 {

	public static void main(String[] args) {
		
		String a = "String  ()()()()Compression: Implement a program that compres";
		
		int count = 0;
		
		for(int i=0; i < a.length(); i++) {
			char ch = a.charAt(i);
			
			if(ch == '(') {
				count++;
			} else if (ch == ')') {
				count--;
			}
			
			if (count < 0) {
				break;
			}
			
		}
		
		
		if (count == 0)
			System.out.println("Balanced");
		else
			System.out.println("Imbalanced" );
		
		
	}

}
