package com.datastructure.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 *  1            <---
 *  /   \
 * 2     3         <---
 *  \     \
 *   5     4       <---
 */
public class BinaryRightSideView {

	public static List<Integer> rightSideView(TreeNode root){
		Map<Integer, Integer> rightMostNodeWithDepth = new HashMap<>();
		List<Integer> result = new ArrayList<>();

		if(root == null){
			return new LinkedList<>();
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);

		Queue<Integer> depthQueue = new LinkedList<>();
		depthQueue.add(0);

		while(!queue.isEmpty()){
			TreeNode node = queue.poll();
			int depth = depthQueue.poll();
			if(node!=null) {
				//rightMostNodeWithDepth.compute(depth, (k, v) -> v != null ? v : node.getData());
				if(!rightMostNodeWithDepth.containsKey(depth)) {
					rightMostNodeWithDepth.put(depth, node.getData());
				}

				if (node.getRight() != null) {
					queue.add(node.getRight());
				}
				if (node.getLeft() != null) {
					queue.add(node.getLeft());
				}

				depthQueue.add(depth + 1);
				depthQueue.add(depth+1);
			}
		}

		for(int i=0;i < rightMostNodeWithDepth.size(); i++){
			result.add(rightMostNodeWithDepth.get(i));
		}

		return result;
	}

	/**				77
	 * 			/		\
	 * 			21		22
	 * 		/		\
	 * 	8				12
	 * /	\		/	\
	 * 5 	6 		3   2
	 *
	 *
	 * 77 -- 22 -- 12 -- 2
	 * @param args
	 */

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

		// TreeNode level1Right = new TreeNode(5, null, null);
		// TreeNode level1Right = new TreeNode(6, null, null);
		//
		// TreeNode level1Left = new TreeNode(5, null, null);
		// TreeNode level1Right = new TreeNode(6, null, null);
		//
		// TreeNode level1Left = new TreeNode(5, null, null);
		// TreeNode level1Right = new TreeNode(6, null, null);
		//

		List<Integer> result = BinaryRightSideView.rightSideView(root);
		System.out.println(result.toString());

		int maxlevel = 0;
		List<Integer> result2 = new ArrayList<>();
		rightSideViewApproach2(root, result2, 1);
		System.out.println(result2.toString());
	}

	public static void rightSideViewApproach2(TreeNode root, List<Integer> result,  int currentLevel){
		if(root == null){
			return;
		}

		if(currentLevel > result.size()){
			result.add(root.getData());
		}

		rightSideViewApproach2(root.getRight(), result, currentLevel+1);
		rightSideViewApproach2(root.getLeft(), result, currentLevel+1);
	}

}
