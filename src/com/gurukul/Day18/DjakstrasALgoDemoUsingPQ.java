package com.gurukul.Day18;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;


class Edges {
	private int parent;
	private int child;
	private int cost;
	
	Edges() {}

	public Edges(int parent, int child, int cost) {
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
		return "Edges [parent=" + ((char)(parent+65)) + ", child=" + ((char)(child+65)) + ", cost=" + cost + "]";
	}
	
	
}

public class DjakstrasALgoDemoUsingPQ {

	public static void main(String[] args) {

		PriorityQueue<Edges> distance=new PriorityQueue<>(new Comparator<Edges>() {

			@Override
			public int compare(Edges o1, Edges o2) {
				// TODO Auto-generated method stub
				return o1.getCost()-o2.getCost();
			}});
		
		Map<Integer, List<Edges>> graph = new HashMap<>();

        // A
        List<Edges> EdgesAList = new ArrayList<>();
        EdgesAList.add(new Edges(0, 1, 4));
        EdgesAList.add(new Edges(0, 3, 8));
        graph.put(0, EdgesAList);

        //B
        List<Edges> EdgesBList = new ArrayList<>();
        EdgesBList.add(new Edges(1, 0, 4));
        EdgesBList.add(new Edges(1, 2, 3));
        graph.put(1, EdgesBList);

        // C
        List<Edges> EdgesCList = new ArrayList<>();
        EdgesCList.add(new Edges(2, 1, 3));
        EdgesCList.add(new Edges(2, 6, 2));
        EdgesCList.add(new Edges(2, 7, 1));
        graph.put(2, EdgesCList);

        // D
        List<Edges> EdgesDList = new ArrayList<>();
        EdgesDList.add(new Edges(3, 0, 8));
        EdgesDList.add(new Edges(3, 4, 3));
        EdgesDList.add(new Edges(3, 5, 4));
        EdgesDList.add(new Edges(3, 6, 5));
        graph.put(3, EdgesDList);


        // E
        List<Edges> EdgesEList = new ArrayList<>();
        EdgesEList.add(new Edges(4, 3, 3));
        EdgesEList.add(new Edges(4, 5, 9));
        graph.put(4, EdgesEList);

        // F
        List<Edges> EdgesFList = new ArrayList<>();
        EdgesFList.add(new Edges(5, 3, 4));
        EdgesFList.add(new Edges(5, 4, 9));
        EdgesFList.add(new Edges(5, 6, 6));
        EdgesFList.add(new Edges(5, 7, 2));
        graph.put(5, EdgesFList);


        // G
        List<Edges> EdgesGList = new ArrayList<>();
        EdgesGList.add(new Edges(6, 2, 2));
        EdgesGList.add(new Edges(6, 3, 5));
        EdgesGList.add(new Edges(6, 5, 6));
        EdgesGList.add(new Edges(6, 7, 7));
        graph.put(6, EdgesGList);

        // H
        List<Edges> EdgesHList = new ArrayList<>();
        EdgesHList.add(new Edges(7, 2, 1));
        EdgesHList.add(new Edges(7, 5, 2));
        EdgesHList.add(new Edges(7, 6, 7));
        graph.put(7, EdgesHList);
        int nodes=8;
		int start=0;
		int sum=0;
		boolean visited[]=new boolean[nodes];
//		int parent[]=new int[nodes];
		visited[start]=true;
		int parentCost = 0;
		for(int count=1;count<nodes;count++){
		
		List<Edges> list=graph.get(start);
		for(int i=0;i<list.size();i++) {
			
			Edges Edges=list.get(i);
			int j=Edges.getChild();
			Edges.setCost(Edges.getCost() + parentCost);
			if(!visited[j]) {
				distance.add(Edges);
			}
		}
		
		Edges selected= distance.poll();
		start=selected.getChild();
		sum+=selected.getCost();
		visited[start]=true;
		System.out.println(selected);
		parentCost = selected.getCost();
		
		}
		
	System.out.println(sum);	
		
		
		
		
	}

}
