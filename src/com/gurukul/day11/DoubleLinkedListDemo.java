package com.gurukul.day11;

class Node2 <T extends Comparable<T>>{
	private T data;
	private Node2<T> next;
	private Node2<T> prev;
	
	
	public Node2(T data, Node2<T> next, Node2<T> prev) {
		super();
		this.data = data;
		this.next = next;
		this.prev = prev;
	}

	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public Node2<T> getNext() {
		return next;
	}
	
	public void setNext(Node2<T> next) {
		this.next = next;
	}
	
	public Node2<T> getPrev() {
		return prev;
	}
	
	public void setPrev(Node2<T> prev) {
		this.prev = prev;
	}
	
	public String toString() {
		return " " + data + " ";
	}
	
}

class LinkedList2<T extends Comparable<T>>{
	private Node2<T> first=null;
	void add(T data) {
		Node2<T> newnode1=new Node2<T>(data, null, null);
		if(first==null) {
			first=newnode1;
		}
		else
		{
			Node2<T> temp=first;
			while(temp.getNext()!=null) {
				temp=temp.getNext();
			}
			temp.setNext(newnode1);
			newnode1.setPrev(temp);
		}
	}
	
	public String toString() {
		String msg="[";
		Node2<T> temp=first;
		while(temp != null) {
			
			msg+=(temp.getData()+" ");
			temp=temp.getNext();
		}
		msg+="]";
		return msg;
	}
	
	void displayFrwd() {
		Node2<T> temp = first;
		if(first == null) {			
			System.out.print(" ");
		} else {
			while(temp != null) {
				System.out.print(" " + temp.getData());
				temp=temp.getNext();
			}
		}
	}
	
	
	void displayRev() {
		Node2<T> temp = first;
		
			while(temp.getNext() != null) {
//				System.out.print(" " + temp.getData());
				temp=temp.getNext();				
			}
			
			while(temp != null) {
				System.out.print(" " + temp.getData());
				temp = temp.getPrev();
			}
	}
	
	public void Delete(T data) {
		Node2<T> temp = first;
		while (temp != null) {
		    if (temp.getData() == data)
			break;
		    temp = temp.getNext();
		}
		
		if (temp == null)
		    return;
		if (temp == first) {
		    first = first.getNext();
		    first.setPrev(null);
		} else {
		    if (temp.getNext() == null)
			temp.getPrev().setNext(null);
		    else {
			temp.getNext().setPrev(temp.getPrev());
			temp.getPrev().setNext(temp.getNext());
		    }
		}
	
}

}
public class DoubleLinkedListDemo {	
	
	public static void main(String[] args) {
		
		LinkedList2 <Integer> x = new LinkedList2<Integer>();
		x.add(10);
		x.add(20);
		x.add(30);
		x.add(40);
		x.add(50);
		x.add(60);
		x.add(70);
		x.add(80);
		x.add(90);
		x.displayFrwd();
		System.out.println();
		x.displayRev();
		x.Delete(20);
		System.out.println();
		x.displayFrwd();
		
	}

}
