package com.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTransversal {

	public LevelOrderTransversal() {
		// TODO Auto-generated constructor stub
	}
	
	public static void levelOrderTransversal(TreeNode node) {
		int height = heightOfTree(node);
		for(int i=1;i<=height;i++) {
			levelOrderTransversal(node,i);
		}
		
	}
	
	private static void levelOrderTransversal(TreeNode node,int level) {
		if(node == null) return;
		
		if(level == 1) {
			System.out.println(""+node.getData());
		}else if(level > 1){
			levelOrderTransversal(node.getLeft(),level-1);
			levelOrderTransversal(node.getRight(),level-1);
		}
	}
	
	public static int heightOfTree(TreeNode node) {
		
		if(node == null) {
			return 0;
		}
		
		int leftHeight = heightOfTree(node.getLeft());
		int rightHeight = heightOfTree(node.getRight());
		
		return Math.max(leftHeight, rightHeight) + 1;
	}
}
