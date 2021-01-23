package com.datastructure.tree;

import java.util.Stack;

public class BinaryTreeTransversalIterative {

	public static void main(String[] args) {
		 Node  root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        
        PreOrderTransversal(root); //  1 2 4 5 3
        System.out.println("");
        InOrderTransversal(root);
        System.out.println("");
        
	}
	
	public static void PreOrderTransversal(Node node) {
		if(node == null)
			return;
		
		Stack<Node> stack = new Stack<Node>();
		stack.push(node);
		while(!stack.isEmpty()) {
			
			Node tmp = stack.pop();
			System.out.print(" "+tmp.data);
			
			
			if(tmp.right!=null) {
				stack.push(tmp.right);
			}
			if(tmp.left!=null) {
				stack.push(tmp.left);
			}
		}
		
	}
	
	public static void InOrderTransversal(Node node) {
		if(node == null)
			return;
		
		Stack<Node> stack = new Stack<Node>();
		
		while(node!=null) {
			stack.push(node);
			node = node.left;
		}
		
		while(!stack.isEmpty()) {
			
			Node tmp = stack.pop();
			System.out.print(tmp.data+" ");
			if(tmp.right!=null) {
				//stack.push(tmp.right);
				tmp = tmp.right;
				while(tmp!=null) {
					stack.push(tmp);
					tmp = tmp.left;
				}
			}
			
		}
		
	}
	

}
