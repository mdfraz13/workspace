package com.datastructure.list.linkedlists;

public class CustomLinkedList {
	
	private LinkNode head;
	private int size;
	
	public void add(int data) {
		LinkNode newnode = new LinkNode(data);
		
		if(head == null) {
			head = newnode;
			return;
		}
		
		LinkNode temp = head;
		while(temp.getNext()!=null) {
			temp = temp.getNext();
		}
		
		temp.setNext(newnode);
		size++;
	}
	
	public void remove() {
		if(head == null)
			return;
		
		LinkNode temp = head;
		
		while(temp.getNext().getNext()!=null) {
			temp = temp.getNext();
		}
		temp.setNext(null);
		size--;
	}
	
	public int size() {
		return size;
	}
	
	@Override
	public String toString() {
		return "CustomLinkedList [head =>" + head + "]";
	}
	
	public void reverse() {
		ReverseALinkedList.reverse(head);
	}

}
