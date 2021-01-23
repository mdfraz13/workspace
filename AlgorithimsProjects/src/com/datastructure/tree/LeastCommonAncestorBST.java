package com.datastructure.tree;

public class LeastCommonAncestorBST {

	public static TreeNode leastCommonAncestor(TreeNode node, int first, int second){
		if(node == null)
			return null;

		int data = node.getData();

		if(data < first && data < second){
			return leastCommonAncestor(node.getRight(), first, second);
		}else if(data > first && data > second){
			return leastCommonAncestor(node.getLeft(), first, second);
		}else{
			return node;
		}
	}

	/**
	 * 				100
	 * 			/		 \
	 * 		80				110
	 *		/\ 			/		\
	 * 	60		90		105		125
	 * 	/\		/ \
	 * 		  85	95
	 * null
	 */
	public static TreeNode initializeTree(){
		TreeNode leftNode2 = new TreeNode();
		leftNode2.setData(60);

		TreeNode leftNode3 = new TreeNode();
		leftNode3.setData(85);

		TreeNode rightNode3 = new TreeNode();
		rightNode3.setData(95);

		TreeNode rightNode2 = new TreeNode();
		rightNode2.setData(90);
		rightNode2.setLeft(leftNode3);
		rightNode2.setRight(rightNode3);

		TreeNode leftNode1 = new TreeNode();
		leftNode1.setData(80);
		leftNode1.setLeft(leftNode2);
		leftNode1.setRight(rightNode2);


		TreeNode leftRightNode2 = new TreeNode();
		leftRightNode2.setData(105);

		TreeNode rightRightNode2 = new TreeNode();
		rightRightNode2.setData(125);

		TreeNode rightNode1 = new TreeNode();
		rightNode1.setData(110);
		rightNode1.setLeft(leftRightNode2);
		rightNode1.setRight(rightRightNode2);

		TreeNode root = new TreeNode();
		root.setData(100);
		root.setLeft(leftNode1);
		root.setRight(rightNode1);

		return root;
	}

	public static void main(String[] args) {
		TreeNode root = initializeTree();
		System.out.println(root.toString());
		TreeNode result = LeastCommonAncestorBST.leastCommonAncestor(root, 60, 125);
		System.out.println(result.getData());
	}
}
