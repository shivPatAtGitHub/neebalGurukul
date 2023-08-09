package com.gurukul.Day17;

import java.util.Arrays;

public class DjakstraAlgoDemo {

	public static void main(String[] args) {
		int graph[][] ={{1000,4,1000,8,1000,1000,1000,1000},
    		    {4,1000,3,1000,1000,1000,1000,1000},
    		    {1000,3,1000,1000,1000,1000,2,1},
    		    {8,1000,1000,1000,3,4,5,1000},
    		    {1000,1000,1000,3,1000,7,1000,1000},
    		    {1000,1000,1000,4,7,1000,6,2},
    		    {1000,1000,2,5,1000,6,1000,7},
    		    {1000,1000,1,1000,1000,2,7,1000} };
		
	int distance[]= new int [graph.length];
	int parent[]= new int [graph.length];
	Arrays.fill(distance, 1000);
	Arrays.fill(parent, -1);
	
	boolean visited[]= new boolean [graph.length];
	
	int start = 0;
	distance[start] = 0;
	visited[start] = true;
		
	for(int j=1; j<graph.length; j++) {
		for(int i=0; i<graph.length; i++) {
			int sum = graph[start][i] + distance[start];
			if(sum < distance[i] && !visited[i]) {
				parent[i] = start;
				distance[i] = sum;
			} 
		}
		
	int min = 1000;
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
	
	for(int i=0; i < graph.length; i++) {
		System.out.println(((char)(parent[i]+65)) + " " + ((char)(i+65)));
	}
	
	}

}