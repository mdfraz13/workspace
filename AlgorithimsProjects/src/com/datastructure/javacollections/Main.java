package com.datastructure.javacollections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>(); //extends Vector methods are synchronized.
		Vector<Integer> vector = new Vector<>();
		
		Queue<Integer> queue = new LinkedList<>(); // Queue is interface
		Queue<Integer> queue2 = new ArrayDeque<>();
		
		List<Integer> list = new ArrayList<>();
		List<Integer> list2 = new LinkedList<>();
		//List<Integer> list3 = new ArrayDeque<>();
		
		List<Integer> cpwl = new CopyOnWriteArrayList<>();
	}

}
