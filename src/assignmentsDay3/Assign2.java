package assignmentsDay3;

public class Assign2 {

	public static void main(String[] args) {
		int k = 49;
		for(int i=1; i<=6; i++) {
			
			for(int j=6-i; j>=1; j--) {
				System.out.print("0");
			}

			for(int j=1; j<=i; j++) {					
			System.out.print((char)(k));					
			k = k + 1;
			if (k > 57) {
				k = 48;
			}
			
			
			} 
			System.out.println();
		}
	}

}
