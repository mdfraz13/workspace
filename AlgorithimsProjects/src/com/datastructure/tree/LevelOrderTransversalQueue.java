package com.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTransversalQueue {

	public static void levelOrderTransversalUsingQueue(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			TreeNode tempNode = queue.remove();
			if(tempNode!=null) {
				System.out.println(tempNode.getData());

				queue.add(tempNode.getLeft());
				queue.add(tempNode.getRight());
			}
		}
	}
}
