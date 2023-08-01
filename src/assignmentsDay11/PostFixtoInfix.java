package assignmentsDay11;

import java.util.Stack;


class PostExpression {
	String exp;
	
	PostExpression(String exp) {
		this.exp = exp;
	}
	
	String converPostfix() {
		String gin = "";
		int len = exp.length();
		
		Stack<String> kcats = new Stack<>();
		
		for (int i = 0; i < len; i++) {
			char ch = exp.charAt(i);
			
			if (Character.isLetter(ch)) {
				kcats.push("" + ch);
			} else {
				String tem1 = kcats.pop();
				String tem2 = kcats.pop();
				gin = "(" + tem2 + ch + tem1 + ")";
				kcats.push(gin);
			}
			
		}
		
		return gin;
	}
	
}



public class PostFixtoInfix {

	public static void main(String[] args) {
	
		String x = "ab+cd/-";
		
		PostExpression postExp = new PostExpression(x);

		System.out.println(postExp.converPostfix());
		
		
		
	}

}


