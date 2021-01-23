package com.datastructure.tree;

public class Tree {

	private TreeNode root;

	public Tree(){}

	public Tree(TreeNode root){
		this.root = root;
	}

	public void initializeTree(){
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

		root.setData(100);
		root.setLeft(leftNode1);
		root.setRight(rightNode1);
	}

}
