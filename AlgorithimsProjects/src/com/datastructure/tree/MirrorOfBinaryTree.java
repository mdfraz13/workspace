package com.datastructure.tree;

public class MirrorOfBinaryTree {

	public static TreeNode mirrorOfTree(TreeNode node) {

		if(node == null)
			return node;

		mirrorOfTree(copyTreeNode2(node.getLeft()));
		mirrorOfTree(copyTreeNode2(node.getRight()));
		copyTreeNode2(node);

		return node;
	}

	public static TreeNode copyTreeNode(TreeNode node){
		if(node == null){
			return null;
		}

		TreeNode tempNode = new TreeNode();
		tempNode.setRight(node.getLeft());
		tempNode.setLeft(node.getRight());
		tempNode.setData(node.getData());

		return tempNode;
	}

	public static TreeNode copyTreeNode2(TreeNode node){
		if(node == null){
			return null;
		}

		TreeNode tempNode = node.getRight();
		node.setRight(node.getLeft());
		node.setLeft(tempNode);

		return node;
	}

}
