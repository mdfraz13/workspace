package com.datastructure.list.linkedlists;

public class LinkNode {

	private int data;
	private LinkNode next;
	
	public LinkNode() {
	}
	
	public LinkNode(int data) {
		this.data = data;
		this.next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public LinkNode getNext() {
		return next;
	}

	public void setNext(LinkNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "" + data + " =>" + next + "";
	}

}
