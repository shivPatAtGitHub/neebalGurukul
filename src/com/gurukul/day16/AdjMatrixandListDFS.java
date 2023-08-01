package com.gurukul.day16;

import java.util.Stack;

public class AdjMatrixandListDFS {

	public static void main(String[] args) {
		int x[][] = {{0,1,0,1,0,0,0},
				{1,0,1,0,0,0,1},
				{0,1,0,0,0,1,1},
				{1,0,0,0,1,0,1},
				{0,0,0,1,0,1,0},
				{0,0,1,0,1,0,1},
				{0,1,1,1,0,1,0}};
	
	Stack<Integer> stack = new Stack<>();
	boolean visited[] = new boolean[x.length];
	int s = 0;
	visited[0] = true;
	System.out.print((char)(65) + " ");
	stack.push(s);
	
	while(!stack.isEmpty()) {
		s = stack.peek();
		boolean flag = false;
		for(int i=0; i< x.length; i++) {
			if(x[s][i] == 1 && !visited[i]) {
				flag = true;
				stack.push(i);
				System.out.print((char)(i+65) + " ");
				visited[i] = true;
				break;
			}
		}
		
		if(!flag) {
			stack.pop();
		}
	}
		
		
	}

}
