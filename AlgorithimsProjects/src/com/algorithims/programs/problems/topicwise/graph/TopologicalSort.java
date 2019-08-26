package com.algorithims.programs.problems.topicwise.graph;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class TopologicalSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a graph given in the above diagram
        Graph g = new Graph(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
 
        System.out.println("Following is a Topological " +
                           "sort of the given graph");
        g.topologicalSort();
       
	}

}
class Graph {
	
	private int V;   // No. of vertices
    private LinkedList<Integer> adj[]; // Adjacency List
    
    
	public Graph(int v) {
		V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i) {
            adj[i] = new LinkedList();
        }
        
	}
	
	public void addEdge(int v,int w) {
		 adj[v].add(w);
	}
	
	public void topologicalSort() {
		boolean[] visited = new boolean[V];
		Stack<Integer> result = new Stack<>();
		
		for(int i=0;i<V;i++) {
			visited[i] = false;
		}
		
		for(int i=0;i<V;i++) {
			if(!visited[i]) {
				topologicalSortUtil(i,visited,result);
			}
		}
		
		for(int i=0;i<V;i++)
			System.out.print(" "+result.pop());
		
	}
	
	private void topologicalSortUtil(int start,boolean[] visited,Stack<Integer> result) {
		visited[start] = true;
		
		for(int adjacent : adj[start]) {
			visited[adjacent] = true;
			if(!result.contains(adjacent)) {
				topologicalSortUtil(adjacent,visited,result);
			}
		}
		result.push(start);
	}
	
}
