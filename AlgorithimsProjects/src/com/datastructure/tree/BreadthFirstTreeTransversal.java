package com.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BreadthFirstTreeTransversal {
	
	public static void breadthFirstTreeTransversal(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		if(root!=null){
			queue.add(root);
		}

		while(!queue.isEmpty()){
			TreeNode tempNode = queue.poll();
			if(tempNode!=null) {
				System.out.println(tempNode.getData());
				queue.add(tempNode.getLeft());
				queue.add(tempNode.getRight());
			}
		}
	}

}
