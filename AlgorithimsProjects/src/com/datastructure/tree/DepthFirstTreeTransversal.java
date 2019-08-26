package com.datastructure.tree;

import java.util.Stack;

public class DepthFirstTreeTransversal {
	
	public static void depthFirstTreeTransversal(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		if(root!=null)
			stack.push(root);
		while(!stack.isEmpty()) {
			TreeNode tempNode = stack.pop();
			System.out.println(tempNode.getData());
			if(tempNode.getLeft()!=null) {
				stack.push(tempNode.getLeft());
			}
			if(tempNode.getRight()!=null) {
				stack.push(tempNode.getRight());
			}
		}
	}

}
