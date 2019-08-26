package com.datastructure.tree;

public class TreeClient {

	/**
	 * 				100
	 * 			/		 \ 
	 * 		80				90
	 *		/\ 			/		\
	 * 	70		60		95		75
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
//		LevelOrderTransversal.levelOrderTransversal(root);
		
		//LevelOrderTransversal.levelOrderTransversalUsingQueue(root);
		
		//DepthFirstTreeTransversal.depthFirstTreeTransversal(root);
		System.out.println(root);
		if(IsBinaryTreeAlgorithm.isBinarySearchTree(root)) {
			System.out.println("Yes, I am BinaryTree");
		}else {
			System.out.println("Sorry, I am not BinaryTree");
		}
	}

}
