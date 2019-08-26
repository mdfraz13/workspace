package com.datastructure.list.linkedlists;

public class ReverseALinkedList {

	public static LinkNode reverse(LinkNode head) {
		LinkNode prev = null;
		LinkNode curr = head;
		LinkNode next = null;
		while(curr!=null) {
			next = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr = next;
		}
		head = prev;
		return head;
	}

}
