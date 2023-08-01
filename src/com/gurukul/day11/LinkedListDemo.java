package com.gurukul.day11;
	
class Node<T extends Comparable<T>>{
		private T data;
		private Node<T> next;
		public T getData() {
			return data;
		}
		public void setData(T data) {
			this.data = data;
		}
		public Node<T> getNext() {
			return next;
		}
		public void setNext(Node<T> next) {
			this.next = next;
		}
		public Node(T data, Node<T> next) {
			super();
			this.data = data;
			this.next = next;
		}
		@Override
		public String toString() {
			return "Node [data=" + data + "]";
		}
		
	}
	
	class LinkedList<T extends Comparable<T>>{
		// initiated the first node in the linked list and set its name to first, first being set to empty(null) 
		private Node<T> first=null;
		void add(T data) {
//		created a new node which has properties of a node holding data and a place for ref of the next 
			Node<T> newnode=new Node<T>(data,null);
//		checking if the first is null and if true storing the newnode in first
//		(making the newly form node the first node of the list)
			if(first==null) {
				first=newnode;
			}
			else
			{
//		if not, creating a temp node and 
//		coping the data and ref of the next from the very first node of the list
//		after this temp holds data of first node and ref of the next		
				Node<T> temp=first;
//		now while the ref of the next for temp node is not null
//		access the value stored in ref of next of the temp and storing the same in temp
//		this helps us traverse the linked list 
//		traverse the list until we find a node where ref of the next is null
//		once that happens it signifies we have reached the end node of the list
//		now we can set the ref of the new node in the ref of the next of the current temp 
//		whose ref of next is null
//		we have added the newnode created above at the end of the list
//		this newnode holds data and null value in its ref of the next
				
				while(temp.getNext()!=null) {
					temp=temp.getNext();
				}
				temp.setNext(newnode);
			}
		}
		public String toString() {
			String msg="[";
			Node<T> temp=first;
			while(temp != null) {
				
				msg+=(temp.getData()+" ");
				temp=temp.getNext();
			}
			msg+="]";
			return msg;
		}
		
	
//	count the number of nodes
	public int count() {
		int c = 0;
		Node <T> temp = first;
		if (temp == null) {
			return 0;
		} else {
			while(temp != null) {
				c++;
				temp=temp.getNext();
			}
			return c;			
		}
	}
	
	
//	finds the largest
	public T max() {
		
		Node<T> temp=first;			
		T largest = temp.getData();
		while(temp != null) {
			if (temp.getData().compareTo(largest)>0) {
				largest = temp.getData();
			}
			
			temp=temp.getNext();
		}
		
		
		return  largest;
	}
	
	
//	
////	insert a node after the given value
	boolean insert(T data, T afterdata) {
		
		
		
		Node<T> temp = first;
		while(temp != null) {
				if (temp.getData().equals(afterdata)){
					Node<T> newnode=new Node<T>(data, temp.getNext());
					temp.setNext(newnode);
					return true;
				};
			
			temp=temp.getNext();
		}
		return false;
		
	}
//	
//	
////	delete the given data
	boolean delNode(T data) {
		Node<T> temp = first;
		Node<T> listNext = temp.getNext();
		if (temp.getNext() == null) {
			first = null;
			return true; 
		} else {
			while(listNext!=null) {
				if(first.getData() == data) {
					first = first.getNext();
					return true;
				} else if(listNext.getData() == data) {
					temp.setNext(listNext.getNext());
					return true;
				}
				temp=temp.getNext();
			}
			return false;
		}
		
		
	}
//	
//	
////	reverse the list
	void reverse() {
		Node<T> prev = null;
		while(first!=null) {
			Node<T> temp = first.getNext();
			first.setNext(prev);
			prev = first;
			first = temp;
		}
		first = prev;
	}
//	
//	
////	inserts the element at the given index
	boolean insertAt(T data, int index) {
		int i = 0;
		Node<T> temp = first;
		while(temp != null) {
		i++;
		if(i == index) {
			Node<T> newnode = new Node<T>(data, null);
			Node<T> listNext = temp.getNext();
			temp.setNext(newnode);
			
			newnode.setNext(listNext);
			return true;
		}
			temp=temp.getNext();
		}
		return false;
	}
	
}

public class LinkedListDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> x=new LinkedList<Integer>();
		x.add(10);
		x.add(20);
		x.add(90);
		x.add(40);
		x.add(50);
		x.add(60);
		x.add(50);
		x.add(80);
		x.insert(100, 50);
		x.insertAt(200, 3);
//		x.delNode(1);
		
		System.out.println("Array = " + x);
		System.out.println("Num of Nodes = " + x.count());
		System.out.println("Largest data = " + x.max());
	}
}