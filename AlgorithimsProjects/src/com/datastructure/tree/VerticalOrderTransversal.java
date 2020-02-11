package com.datastructure.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 				100
 * 			/		 \
 * 		80				90
 *		/\ 			/		\
 * 	60		70		95		75
 * 	/\
 * null
 *
 *
 *  60 --> 80 -- 100 --70 -- 95 -- 90 --75
 */
public class VerticalOrderTransversal {

	public static void verticalOrderTransversal(TreeNode root){
		if(root == null){
			return;
		}

		Map<Integer, List<Integer>> map = new HashMap<>();
		dfs(root, map, 0);

		for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()){
			System.out.println("key="+entry.getKey()+", values="+entry.getValue());
		}
	}

	private static void dfs(TreeNode node, Map<Integer, List<Integer>> map, int width){
		List<Integer> integerList ;
		if(map.containsKey(width)){
			integerList = map.get(width);
			integerList.add(node.getData());
		}else{
			integerList = new ArrayList<>();
			integerList.add(node.getData());
		}
		map.put(width, integerList);

		if(node.getLeft()!=null){
			dfs(node.getLeft(), map, width-1);
		}

		if(node.getRight()!=null){
			dfs(node.getRight(), map, width+1);
		}
	}
}
