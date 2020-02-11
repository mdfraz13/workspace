package com.datastructure.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class PrintAllPathOfBinaryTree {

	public static List<String> printAllPathOfTree(TreeNode root){

		if(root == null){
			return Collections.EMPTY_LIST;
		}

		List<String> list = new ArrayList<>();
		dfs(root, list, "");

		return list;
	}

	static void dfs(TreeNode node, List<String> result, String currentPath){

		if(node.getLeft() == null && node.getRight() == null){
			result.add(currentPath + node.getData());
			return;
		}

		currentPath += node.getData();
		if(node.getRight() !=null){
			dfs(node.getRight(), result, currentPath+"==>");
		}

		if(node.getLeft() !=null){
			dfs(node.getLeft(), result, currentPath+"==>");
		}
	}
}
