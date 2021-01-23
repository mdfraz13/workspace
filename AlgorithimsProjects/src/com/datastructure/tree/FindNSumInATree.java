package com.datastructure.tree;

public class FindNSumInATree {

	public static boolean isNSumAvailable(TreeNode root, int n){
		if(root == null){
			return n ==0;
		}

		return dfs(root, n);
	}

	public static boolean dfs(TreeNode node, int n){
		if(node.getLeft()==null && node.getRight()==null){
			return (n - node.getData()) == 0;
		}

		boolean left = false;
		if(node.getLeft() !=null){
			left = dfs(node.getLeft(), n - node.getData());
		}

		boolean right = false;
		if(node.getRight() !=null){
			right = dfs(node.getRight(), n - node.getData());
		}

		return left || right;
	}
}
