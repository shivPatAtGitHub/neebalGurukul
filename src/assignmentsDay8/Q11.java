package assignmentsDay8;

public class Q11 {

	public static void main(String[] args) {
		String a = "thisIsCamelCaseCamelCase";
		int count = 0;
		for(int i = 0; i<a.length();i++) {
			char b = a.charAt(i);
			
			for(char j=65; j<=90; j++) {
				if (b == j) {
					count++;
				}
			}
			
		}
		System.out.println(count+1);
		
	}

}
