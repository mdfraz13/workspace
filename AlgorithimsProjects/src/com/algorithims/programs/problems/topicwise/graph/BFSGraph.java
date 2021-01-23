package com.algorithims.programs.problems.topicwise.graph;

import java.util.LinkedList;
import java.util.List;

/**
 *  Uses Queue
 * @author mfraz
 *
 */
public class BFSGraph {
	
	private int NumberOfVertices;
	private LinkedList<Integer>[] adjencyMatrix;
	
	public BFSGraph(int noOfvertices) {
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
	 * output :- 2 0 3 1 2 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BFSGraph g = new BFSGraph(4);
		 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 2)");
 
        g.BFS(2);
	}
	
	private void addEdge(int x,int y) {
		adjencyMatrix[x].add(y);
	}
	
	private void BFS(int src) {
		// create a boolean array . To think about cycles ,otherwise it won't get terminated
		boolean[] visited = new boolean[NumberOfVertices];
		
		// Create a Queue 
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		// First element i.e source
		queue.push(src);
		
		while(!queue.isEmpty()) {
			
			int current = queue.poll();
			System.out.print(current+" ");
			
			for(int neighbour : adjencyMatrix[current]) {
				if(!visited[neighbour]) {
					visited[neighbour] = true;
					queue.add(neighbour);
				}
			}
		}
		
		
	}

}
