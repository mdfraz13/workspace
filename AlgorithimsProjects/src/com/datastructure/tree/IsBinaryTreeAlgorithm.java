package com.datastructure.tree;

public class IsBinaryTreeAlgorithm {

	public static boolean isBinarySearchTree(TreeNode root) {
		return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	public static boolean isBSTUtil(TreeNode curr, int min, int max) {
		if (curr == null) { return true; }

		if (curr.getData() < min || curr.getData() > max) {
			return false;
		}

		System.out.println(curr);
		return isBSTUtil(curr.getLeft(), min, curr.getData()) && isBSTUtil(curr.getRight(), curr.getData(), max);
	}

}
