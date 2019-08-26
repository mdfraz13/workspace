package com.algorithims.programs.problems;

public class LinkedListDeletion2 {

	public static void main(String[] args){
		LinkedNodeList list = new LinkedNodeList();
		list.add(10);
		list.add(20);
		list.add(90);
		list.add(30);
		
		list.display();
		list.removeData(90);
		list.display();
	}
	
	
}
class LinkedNode{
	
	private int data;
	private LinkedNode next;
	
	public LinkedNode(){
		
	}
	
	public LinkedNode(int data){
		this.data = data;
		this.next = null;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public LinkedNode getNext() {
		return next;
	}
	public void setNext(LinkedNode next) {
		this.next = next;
	}
}
class LinkedNodeList{
	
	private int size;
	private LinkedNode head;
	
	public LinkedNodeList(){
		head = new LinkedNode(0);
		size = 0;
	}
	
	public void add(int data){
		
		// create new node
		LinkedNode newnode = new LinkedNode(data);
		newnode.setNext(null);
		
		LinkedNode currNode = head;
		while(currNode.getNext() !=null){
			currNode = currNode.getNext();
		}
		currNode.setNext(newnode);
				
		size++;
	}
	
	public void display(){
		LinkedNode currNode = head;
		
		while(currNode !=null){
			int d = currNode.getData();
			currNode = currNode.getNext();
			System.out.println("--> "+d);
		}
	}
	
	public void removeData(int data){
		LinkedNode currNode = head;
		while(currNode !=null){
			int d = currNode.getData();
			if(data == d){
				//currNode.getNext();
				continue;
			}
			currNode = currNode.getNext();
			System.out.println("--> "+d);
		}
	}
	
	public int getSize(){
		return size;
	}
	
	
}