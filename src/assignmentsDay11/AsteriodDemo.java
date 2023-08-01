package assignmentsDay11;

import java.util.Stack;

class AsteriodState {
	int val[];
	
	AsteriodState() {}
	
	AsteriodState(int val[]) {
		this.val = val;
	}
	
	void asteriodAr() {
		
		
		Stack<Integer> ast = new Stack<>();
		
//		int asteriod[] = {10, 2, -5, -9, 8, 4, -4};
		
		for(int i=0; i<val.length; i++) {
			if(ast.isEmpty()) {
				ast.push(val[i]);
			} else {
				if((val[i]) > 0) {
					ast.push(val[i]);
				} else if(val[i] < 0){
					if(Math.abs(val[i]) > Math.abs(ast.peek()) ) {
						ast.pop();
						ast.push(val[i]);
					} else {
						ast.push(val[i]);
					}	
				}
			}			
		}
		
		while(ast.peek() != 0) {
			System.out.print(ast.peek());
			ast.pop();
		}
		
	}
	
	
}


public class AsteriodDemo {

	public static void main(String[] args) {
//+ moves right -->
// - moves left <--		
		int asteriod[] = {10, 2, -5, -9, 8, 4, -4};
		
		AsteriodState x = new AsteriodState();
		
		x.asteriodAr();
		
		
		
	}

}
