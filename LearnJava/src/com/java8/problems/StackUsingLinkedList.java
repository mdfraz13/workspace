package com.java8.problems;

import java.util.LinkedList;

public class StackUsingLinkedList {

	private LinkedList<String> list;
	private int size = 0;
	
	public StackUsingLinkedList() {
		 list = new LinkedList<>();
		 
	}
	
	public void push(String data) {
		list.addFirst(data);
	}
	
	public String pop() {
		String value = list.getFirst();
		list.removeFirst();
		return value;
	}
	
	public int size() {
		return list.size();
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public static void main(String[] args) {
		StackUsingLinkedList stk = new StackUsingLinkedList();
		stk.push("1");
		stk.push("2");
		stk.push("3");
		stk.push("4");
		stk.push("5");
		
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		
		System.out.println(stk.size());
		System.out.println(stk.isEmpty());
	}
	
}
