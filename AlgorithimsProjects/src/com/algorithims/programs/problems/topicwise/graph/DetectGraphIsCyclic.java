package com.algorithims.programs.problems.topicwise.graph;

import java.util.LinkedList;

/**
 * Can be done using DFS
 * @author mfraz
 *
 */
public class DetectGraphIsCyclic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DetectGraphIsCyclic g = new DetectGraphIsCyclic(4);
		 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println(g.isCyclic());
	}
	
	private int NumberOfVertices;
	private LinkedList<Integer>[] adjencyMatrix;
	
	public DetectGraphIsCyclic(int noOfvertices) {
		NumberOfVertices = noOfvertices;
		adjencyMatrix = new LinkedList[NumberOfVertices];
		for(int i=0;i<NumberOfVertices;i++)
			adjencyMatrix[i] = new LinkedList<Integer>();
	}
	
	private void addEdge(int x,int y) {
		adjencyMatrix[x].add(y);
	}
	
	private boolean isCyclic() {
		
		boolean[] visited = new boolean[NumberOfVertices];
		boolean[] stackRec = new boolean[NumberOfVertices];
		
		for(int i=0;i<NumberOfVertices;i++) {
			if(isRecursiveCycle(i, visited, stackRec))
				return true;
		}
		
		
		return false;
	}
	
	private boolean isRecursiveCycle(int i,boolean[] visited,boolean[] stackRec) {
		
		if(!visited[i])
		{
			visited[i] = true;
			stackRec[i] = true;
			
			for(int x : adjencyMatrix[i]) {
				if(!visited[x] && isRecursiveCycle(x, visited, stackRec)) {
					return true;
				}else if(stackRec[x]){
					return true;
				}
			}
		}
		stackRec[i] = false;
		return false;
	}
	
}
