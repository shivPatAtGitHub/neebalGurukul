package com.gurukul.Day17;

import java.util.Arrays;

public class PrimsAlgoDemo {

	public static void main(String[] args) {
		int graph[][] ={{Integer.MAX_VALUE,4,Integer.MAX_VALUE,8,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
    		    {4,Integer.MAX_VALUE,3,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
    		    {Integer.MAX_VALUE,3,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,2,1},
    		    {8,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,3,4,5,Integer.MAX_VALUE},
    		    {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,3,Integer.MAX_VALUE,7,Integer.MAX_VALUE,Integer.MAX_VALUE},
    		    {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,4,7,Integer.MAX_VALUE,6,2},
    		    {Integer.MAX_VALUE,Integer.MAX_VALUE,2,5,Integer.MAX_VALUE,6,Integer.MAX_VALUE,7},
    		    {Integer.MAX_VALUE,Integer.MAX_VALUE,1,Integer.MAX_VALUE,Integer.MAX_VALUE,2,7,Integer.MAX_VALUE} };
		
	int distance[]= new int [graph.length];
	int parent[]= new int [graph.length];
	Arrays.fill(distance, Integer.MAX_VALUE);
	Arrays.fill(parent, -1);
	
	boolean visited[]= new boolean [graph.length];
	
	int start = 0;
	distance[start] = 0;
	visited[start] = true;
		
	for(int j=1; j<graph.length; j++) {
		for(int i=0; i<graph.length; i++) {
			if(graph[start][i] < distance[i] && !visited[i]) {
				parent[i] = start;
				distance[i] = graph[start][i];
			} 
		}
		
	int min = Integer.MAX_VALUE;
	int minNode = start;
	
		for(int i=0; i< distance.length; i++) {
			if(distance[i] < min && !visited[i]) {
				min = distance[i];
				minNode = i;
			}
		}
			visited[minNode] = true;
			start = minNode;
	}
	
	int cost = 0;
	for(int i=0; i < graph.length; i++) {
		System.out.println(((char)(parent[i]+65)) + " " + ((char)(i+65)));
		cost += distance[i];
	}
	
	System.out.println("\nCost: " + cost);
	
	
	
	
	}

}
