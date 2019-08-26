package com.datastructure.tree;

public class BinaryTreeTransversal {

	
	/**
	 *  4 2 5 1 3
 	 *  1 2 4 5 3
 	 *  4 5 2 3 1
	 * @param args
	 */
	public static void main(String[] args) {
		 Node  root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        
        InOrderTransversal(root);
        System.out.println("");
        PreOrderTransversal(root);
        System.out.println("");
        PostOrderTransversal(root);
	}
	
	public static void PreOrderTransversal(Node node) {
		if(node == null)
			return;
		
		System.out.print(" "+node.data);
		PreOrderTransversal(node.left);
		PreOrderTransversal(node.right);
	}
	
	public static void PostOrderTransversal(Node node) {
		if(node == null)
			return;
		
		PostOrderTransversal(node.left);
		PostOrderTransversal(node.right);
		System.out.print(" "+node.data);
	}
	
	public static void InOrderTransversal(Node node) {
		if(node == null)
			return;
		
		InOrderTransversal(node.left);
		System.out.print(" "+node.data);
		InOrderTransversal(node.right);
	}

}
