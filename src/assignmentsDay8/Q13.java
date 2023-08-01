package assignmentsDay8;

public class Q13 {

	public static void main(String[] args) {
		String a = "abc";
		
		String b[] = a.split(" ");
		
		
		for(int i=0; i<a.length(); i++) {
			for(int j=0; j<a.length(); j++) {
				char c = a.charAt(i);

				System.out.println(b[i] +" "+ b[j]);
				}
			}
		}	
		
		
	}


