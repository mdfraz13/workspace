package com.datastructure.sortingalgos.graphs;

import java.util.List;

public class Graph {

	private int vertex;
	private List<Integer> edges;

	public Graph(int vertex){
		this.vertex = vertex;
	}

	public int getVertex() {
		return vertex;
	}

	public void setVertex(int vertex) {
		this.vertex = vertex;
	}

	public List<Integer> getEdges() {
		return edges;
	}

	public void setEdges(List<Integer> edges) {
		this.edges = edges;
	}
}
