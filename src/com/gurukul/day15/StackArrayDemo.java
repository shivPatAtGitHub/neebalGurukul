package com.gurukul.day15;

class ArrayStack<T>{
	T arr[];
	int top = -1;
	
	ArrayStack() {
		arr = (T[]) new Object[5];
	} 	

	ArrayStack(int size) {
		arr = (T[]) new Object[size];
	}

	T push(T x) {
		if(top == arr.length-1) {
			throw new RuntimeException("Stack is Full");			
		} else {
			return arr[++top] = x; 
		}
	}

	boolean isEmpty() {
		return top == -1;
	}
	

	T pop() {
		if(top == -1) {
			throw new RuntimeException("Stack is Full");			
		} else {
			return arr[top--]; 
		}
	}
	
	T peak() {
		if(top == -1) {
			throw new RuntimeException("Stack is Full");			
		} else {
			return arr[top]; 
		}
	}
}



public class StackArrayDemo {
	
	
	public static void main(String[] args) {
		ArrayStack<Integer> s = new ArrayStack<>();
		int x =18;
		
		while(x!=0) {
			s.push(x%2);
			x = x/2;
		}
		
		while(!s.isEmpty()) {
			System.out.print(s.pop());
		}
		
	}


}
