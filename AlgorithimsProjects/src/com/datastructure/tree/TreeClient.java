package com.datastructure.tree;

public class TreeClient {

	/**
	 * 				100
	 * 			/		 \ 
	 * 		80				90
	 *		/\ 			/		\
	 * 	60		70		95		75
	 * 	/\
	 * null		
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		TreeNode leftNode2 = new TreeNode();
		leftNode2.setData(60);
		
		TreeNode rightNode2 = new TreeNode();
		rightNode2.setData(70);
		
		TreeNode leftNode1 = new TreeNode();
		leftNode1.setData(80);
		leftNode1.setLeft(leftNode2);
		leftNode1.setRight(rightNode2);
		
		
		TreeNode leftRightNode2 = new TreeNode();
		leftRightNode2.setData(95);
		
		TreeNode rightRightNode2 = new TreeNode();
		rightRightNode2.setData(75);
		
		TreeNode rightNode1 = new TreeNode();
		rightNode1.setData(90);
		rightNode1.setLeft(leftRightNode2);
		rightNode1.setRight(rightRightNode2);
		
		TreeNode root = new TreeNode();
		root.setData(100);
		root.setLeft(leftNode1);
		root.setRight(rightNode1);
		
//		int height = LevelOrderTransversal.heightOfTree(root);
//		System.out.println(height);
//
		// Level order transversal
		//LevelOrderTransversal.levelOrderTransversal(root);
		//LevelOrderTransversal.levelOrderTransversalUsingQueue(root);

		// DFS and BFS
		//DepthFirstTreeTransversal.depthFirstTreeTransversal(root);
		//BreadthFirstTreeTransversal.breadthFirstTreeTransversal(root);
		//System.out.println(root);

		// Binary Tree is Binary Search Tree
		// if(IsBinaryTreeAlgorithm.isBinarySearchTree(root)) {
		// 	System.out.println("Yes, I am BinaryTree");
		// }else {
		// 	System.out.println("Sorry, I am not BinaryTree");
		// }

		System.out.println(root);
		TreeNode newRoot = MirrorOfBinaryTree.mirrorOfTree(root);
		System.out.println(newRoot);
	}

}
