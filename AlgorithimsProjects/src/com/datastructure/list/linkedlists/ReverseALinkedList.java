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

	public static LinkNode reverseRecursion(LinkNode head){
		if(head == null || head.getNext() == null){
			return head;
		}

		LinkNode newHead = reverseRecursion(head.getNext());

		head.getNext().setNext(head);
		head.setNext(null);

		return newHead;
	}

}
