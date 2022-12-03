package com.kas.BinarySearchTree;

public class TreeNode{
	public int val;
	public TreeNode left;
	public TreeNode right;
	
	public TreeNode(int val){
		this.val = val;
	}
	public TreeNode(int val, TreeNode left, TreeNode right){
		this.val = val;
		this.right = right;
		this.left = left;
	}
}
