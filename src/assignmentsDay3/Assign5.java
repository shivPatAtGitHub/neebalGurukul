package assignmentsDay3;

//import java.util.Scanner;

public class Assign5 {

	public static void main(String[] args) {
		for(int i=1; i<=10000; i++) {
			
//		Scanner sc = new Scanner(System.in);
		int num = i;
		int ogNum = num;
		int ogNum2 = num;
		int dig = 0;
		int digCount = 0;
		
		while(num != 0) {
			dig = num % 10;
			digCount++;
			num = num/10;
		}
//		System.out.println(digCount);
		
		int sum = 0;
		while(ogNum != 0) {
			dig = ogNum % 10;
			sum = (int) (sum + Math.pow(dig, digCount));
			ogNum = ogNum/10;
		}
		
		if(sum == ogNum2) {
			System.out.println(ogNum2);	
		}
		
		}
	}
}


