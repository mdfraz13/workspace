package com.datastructure.tree;

public class CheckBST {

	
	/**
	 * 			4
	 * 		2		5
	 * 	1		3		6
	 * @param args
	 */
	public static void main(String[] args) {
		Node  root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.right = new Node(0);
        
        System.out.println(checkBST(root));

	}
	
	
	static boolean checkBST(Node root) {
        if(root==null) return true;
        
        int data = root.data;
        boolean ans = false;
        
        if(root.left !=null && root.left.data < data) {
        	ans = true;
        }else if( root.left !=null && root.right.data > data) {
        	ans = true;
        }
        
        //if(ans) {
        ans = checkBST(root.left);
        ans = checkBST(root.right);
       
        /*while(root!=null){
        if(root.left !=null && root.left.data < data) {
            ans = true;
            root = root.left;
        }else if(root.right !=null && root.right.data > data) {
            ans = true;
            root = root.right;
        }else{
            ans = false;
            root = null;
            break;
        }
            
        }*/
        
       return ans;        
    }

}
