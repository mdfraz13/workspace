package com.datastructure.list.linkedlists;

public class LinkedListClient {

	public static void main(String[] args) {
		CustomLinkedList linkedList = new CustomLinkedList();
		
		linkedList.add(10);
		linkedList.add(5);
		linkedList.add(9);
		linkedList.add(2);
		linkedList.add(7);
		
		
		System.out.println(linkedList);
//		
//		linkedList.remove();
//		System.out.println(linkedList);
//		
//		linkedList.remove();
//		System.out.println(linkedList);
		
		//linkedList.reverse();
		//System.out.println(linkedList);

		linkedList.resverseRecursive();
		System.out.println(linkedList);
	}

}
