package com.datastructure.tree;

import java.util.ArrayList;
import java.util.List;

public class HeightOfTree {

	public static int heightOfTree(TreeNode root){
		if(root == null){
			return -1;
		}

		int left = heightOfTree(root.getLeft());
		int right = heightOfTree(root.getRight());

		return Math.max(left, right) + 1;
	}

	public static void main(String[] args) {
		TreeNode level2lLeft = new TreeNode(5, null, null);
		TreeNode level2lRight = new TreeNode(6, null, null);

		TreeNode level2RLeft = new TreeNode(3, null, null);
		TreeNode level2RRight = new TreeNode(2, null, null);

		TreeNode level1LLeft = new TreeNode(8, level2lLeft, level2lRight);
		TreeNode level1LRight = new TreeNode(12, level2RLeft, level2RRight);

		TreeNode level0left = new TreeNode(21, level1LLeft, level1LRight);
		TreeNode level0Right = new TreeNode(22, null, null);

		TreeNode root = new TreeNode(77, level0left, level0Right);

		System.out.println(heightOfTree(root));
	}
}
