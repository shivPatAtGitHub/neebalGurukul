package com.gurukul.Day18;

import java.util.Arrays;

public class TopoLogicalSortingDemo {

	public static void main(String[] args) {
		int graph[][] = {{0,1,0,0,0,1,0},
				{0,0,0,0,0,0,0},
				{0,1,0,0,0,1,1},
				{1,0,0,0,1,1,0},
				{0,0,0,0,0,1,1},
				{0,1,0,0,0,0,0},
				{0,0,0,0,0,1,0}};
		
		int len = graph.length;
	
	String ans = "";

	boolean[] visited = new boolean[len];

	Arrays.fill(visited, false);
	int count = 0;
	while (count < len) {
	    boolean isLoop = true;
	    for (int i = 0; i < len; i++) {
	    	boolean flag = true;
	    	for (int j = 0; j < len; j++) {
	    		if (graph[j][i] == 1 && !visited[j]) {
	    			flag = false;
	    			break;
	    		}
	    	}
	    	
			if (flag && !visited[i]) {
				ans += ((char) (i + 65) + " ");
			    visited[i] = true;
			    isLoop = false;
			    count++;
			    
			    for (int k = 0; k < len; k++) {
			   		graph[i][k] = 0;
			   	}
			    
			    break;
			}
	    }
	    
	    if (isLoop) {
	    	System.out.println("loop found");
	    }
	}
	
	System.out.println(ans);
    		
		
	}

}
