package com.datastructure.tree;

import java.util.List;

public class TreeSet {
	
	private TreeNode root;
	
	public TreeSet(){
		
	}

	public void add(int data){
		TreeNode newNode = new TreeNode();
		newNode.setData(data);
		
		if(root == null){
			root = newNode;
		}else{
			
			/*
			 * List<TreeNode> lstTree = root.getChildrens(); if(lstTree!=null){
			 * lstTree.add(newNode); }
			 */
		}
		
	}
	
}
