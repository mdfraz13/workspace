package com.algorithims.programs.problems.topicwise.graph;

import java.util.LinkedList;
import java.util.Stack;

public class DFSGraph {

	private int NumberOfVertices;
	private LinkedList<Integer>[] adjencyMatrix;
	
	public DFSGraph(int noOfvertices) {
		NumberOfVertices = noOfvertices;
		adjencyMatrix = new LinkedList[NumberOfVertices];
		for(int i=0;i<NumberOfVertices;i++)
			adjencyMatrix[i] = new LinkedList<Integer>();
	}
	
	/**
	 * 2
	 * |-----|
	 * 3	 0
	 * 		 |----|
	 * 		 1    2
	 * 
	 * output : - 2 3 0 2 1 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DFSGraph g = new DFSGraph(4);
		 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is Depth First Traversal "+
                           "(starting from vertex 2)");
 
        g.DFS(2);
	}
	
	private void addEdge(int x,int y) {
		adjencyMatrix[x].add(y);
	}
	
	private void DFS(int src) {
		// create a boolean array . To think about cycles ,otherwise it won't get terminated
		boolean[] visited = new boolean[NumberOfVertices];
		
		// Create a stack 
		Stack<Integer> stack = new Stack<Integer>();
		
		// First element i.e source
		stack.push(src);
		
		while(!stack.isEmpty()) {
			
			int current = stack.pop();
			System.out.print(current+" ");
			
			for(int neighbour : adjencyMatrix[current]) {
				if(!visited[neighbour]) {
					visited[neighbour] = true;
					stack.add(neighbour);
				}
			}
		}
	}

}
