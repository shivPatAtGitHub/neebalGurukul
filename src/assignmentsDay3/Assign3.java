package assignmentsDay3;

public class Assign3 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print("* ");				
			}
			
			for(int j=8-i; j>=i; j--) {
				System.out.print("1 ");				
			}
			
//			for(int j=1; j>=5;)
			
			
			System.out.println();
		}
		
		for(int i=1; i<=4; i++) {
			
			for(int j=4; j>=i; j--) {
				System.out.print("* ");				
			}
			
			

			
			System.out.println();
		}
	}

}
