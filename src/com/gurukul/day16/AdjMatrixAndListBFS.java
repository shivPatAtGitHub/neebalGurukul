package com.gurukul.day16;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class AdjMatrixAndListBFS {

	public static void main(String[] args) {
		
		int x[][] = {{0,1,0,1,0,0,0},
					{1,0,1,0,0,0,1},
					{0,1,0,0,0,1,1},
					{1,0,0,0,1,0,1},
					{0,0,0,1,0,1,0},
					{0,0,1,0,1,0,1},
					{0,1,1,1,0,1,0}};
		
		Queue<Integer> arr = new LinkedList<>();
		boolean visited[] = new boolean[x.length];
		int s = 0;
		visited[0] = true;
		System.out.print((char)65 + " ");
		
		arr.add(s);
		
		while(!arr.isEmpty()) {
			s = arr.poll();
			for(int i=0; i < x.length; i++) {
				if(x[s][i] == 1 && !visited[i]) {
					System.out.print((char)(i + 65) + " ");
					arr.add(i);
					visited[i] = true;
				}
			}
		}
		
		
		
	}

}
