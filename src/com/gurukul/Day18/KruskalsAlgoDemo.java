package com.gurukul.Day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

class Edgess {
	private int parent;
	private int child;
	private int cost;
	
	Edgess() {}

	public Edgess(int parent, int child, int cost) {
		super();
		this.parent = parent;
		this.child = child;
		this.cost = cost;
	}

	public int getParent() {
		return parent;
	}

	public void setParent(int parent) {
		this.parent = parent;
	}

	public int getChild() {
		return child;
	}

	public void setChild(int child) {
		this.child = child;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Edgess [parent=" + ((char)(parent+65)) + ", child=" + ((char)(child+65)) + ", cost=" + cost + "]";
	}
	
	
}


public class KruskalsAlgoDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Edgess> pq = new PriorityQueue<>(new Comparator<Edgess>() {

			@Override
			public int compare(Edgess o1, Edgess o2) {
				// TODO Auto-generated method stub
				return o1.getCost()-o2.getCost();
			}});
		
		pq.add(new Edgess(0,1,4));
		pq.add(new Edgess(0,3,8));
		pq.add(new Edgess(1,2,3));
		pq.add(new Edgess(2,6,2));
		
		pq.add(new Edgess(2,7,1));
		pq.add(new Edgess(7,6,7));
		pq.add(new Edgess(5,6,6));
		pq.add(new Edgess(4,5,7));
		
		pq.add(new Edgess(3,4,3));
		pq.add(new Edgess(3,5,4));
		pq.add(new Edgess(3,6,5));
		pq.add(new Edgess(7,5,2));
		
	
		int nodeCount = 8;
		int parent[] = new int[nodeCount];
		Arrays.fill(parent, -1);
		
		for(int i=1; i<nodeCount; ) {
			Edgess Edgess = pq.poll();
			int p = Edgess.getParent();
			int c = Edgess.getChild();
			
			while(parent[p]!=-1) {
				p=parent[p];
			}
			
			while(parent[c]!=-1) {
				c=parent[c];
			}
			
			if(p!=c) {
				System.out.println(Edgess);
				i++;
				parent[c] = p;
			}
		}
		
	}

}
