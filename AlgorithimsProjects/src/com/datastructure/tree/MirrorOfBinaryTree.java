package com.datastructure.tree;

public class MirrorOfBinaryTree {

	public static TreeNode mirrorOfTree(TreeNode node) {

		if(node == null)
			return node;

		mirrorOfTree(node.getLeft());
		mirrorOfTree(node.getRight());

		//node.setData(root.getData());
		TreeNode tempNode = new TreeNode();
		tempNode = node.getRight();
		node.setRight(node.getLeft());
		node.setLeft(tempNode);

		return node;
	}
}
