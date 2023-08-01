package assignmentsDay11;

import java.util.Stack;

class BaseBallPGR {
	String arr[];
	
	
	BaseBallPGR() {}
	
	BaseBallPGR(String arr[]) {
		this.arr = arr; 
	}
	
	int findSum() {
		int tScore = 0;
		int len = arr.length;
		
		Stack<String> s = new Stack<>();
		
		for (int i = 0; i < len; i++) {
			String str = arr[i];
			if (str == "C") {
				tScore -= Integer.parseInt(s.pop());
			} else 
				if (str == "+") {
					String tem1 = s.pop();
					String tem2 = s.peek();
					s.push(tem1);	
					int sum = Integer.parseInt(tem1) + Integer.parseInt(tem2);
					tScore += sum;
					s.push("" + sum);
			} else 
				if (str == "D") {
				int sum = Integer.parseInt(s.peek()) * 2;
				tScore += sum;
				s.push("" + sum);
			} else {
				s.push(arr[i]);
				tScore += Integer.parseInt(arr[i]);
			}
		}
		
		return tScore;
	}
	
}



public class BaseballGamePointRecorderDemo {

	
	public static int findSum(String arr[]) {
		int tScore = 0;
		int len = arr.length;
		
		Stack<String> s = new Stack<>();
		
		for (int i = 0; i < len; i++) {
			String str = arr[i];
			if (str == "C") {
				tScore -= Integer.parseInt(s.pop());
				
			} else if (str == "+") {
				String tem1 = s.pop();
				String tem2 = s.peek();
				s.push(tem1);	
				int sum = Integer.parseInt(tem1) + Integer.parseInt(tem2);
				tScore += sum;
				s.push("" + sum);
			} else if (str == "D") {
				int sum = Integer.parseInt(s.peek()) * 2;
				tScore += sum;
				s.push("" + sum);
			} else {
				s.push(arr[i]);
				tScore += Integer.parseInt(arr[i]);
			}
		}
		
		return tScore;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = { "5", "-2", "4", "C", "D", "9", "+", "+" };
		
		
		
		System.out.print("Total Score Recorded: " + findSum(arr));
		
	}
}




