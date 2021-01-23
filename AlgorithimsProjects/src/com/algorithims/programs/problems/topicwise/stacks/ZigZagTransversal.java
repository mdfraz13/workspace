package com.algorithims.programs.problems.topicwise.stacks;

import java.util.Stack;

public class ZigZagTransversal {

	
/*
 *               31
 *            43     17
 *         5     7  21   13
 *       65  78 
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(31);
		root.left = new Node(43);
		root.right = new Node(17);
		
		root.left.left = new Node(5);
		root.left.right = new Node(7);
		root.right.left = new Node(21);
		root.right.right = new Node(13);
		
		root.left.left.left = new Node(65);
		root.left.left.right = new Node(78);
		zigzag(root);
	}
	
	
	private static void zigzag(Node root) {
		Stack<Node> currentLevel = new Stack<Node>();
		Stack<Node> nextLevel = new Stack<Node>();
		
		currentLevel.push(root);
		boolean isLeft = true;
		while(!currentLevel.isEmpty()) {
			Node node = currentLevel.pop();
			System.out.println(node.getData()+" ");
			if(isLeft) {
				nextLevel.push(node.left);
				nextLevel.push(node.right);
			}else {
				nextLevel.push(node.right);
				nextLevel.push(node.left);
			}
			
			
			if(currentLevel.isEmpty()) {
				isLeft = !isLeft;
				currentLevel = nextLevel;
				nextLevel = new Stack<>();
			}
		}
	}

}
class Node{
	
	int data;
	Node left;
	Node right;
	
	public Node(int data) {
		super();
		this.data = data;
		this.left = null;
		this.right = null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	
}