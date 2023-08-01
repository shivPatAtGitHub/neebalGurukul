package assignmentDay9;

public class RecursionAssign2 {

	static int count(int num) {
		if(num == 0) {
			return 0;
		}
		
		num = num/10;
		
		return 1 + count(num);
	}
	
	
	public static void main(String[] args) {
		
		int n = 505050;
		
		int digit = count(n);
		System.out.print(digit);
		
		
	}

}
