package com.datastructure.tree;

public class TreeNode {

	private int data;
	private TreeNode left;
	private TreeNode right;

	public TreeNode() {
		// TODO Auto-generated constructor stub
	}

	public TreeNode(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public TreeNode(int data, TreeNode left, TreeNode right){
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "TreeNode{" +
			   "data=" + data +
			   ", left=" + left +
			   ", right=" + right +
			   '}';
	}

}
