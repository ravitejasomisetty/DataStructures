package com.binarytree;

public class ConstructPreorderPostOrderBT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pre[] = {1, 2, 4, 8, 9, 5, 3, 6, 7};
		int post[] = {8, 9, 4, 5, 2, 6, 7, 3, 1};
		
		BinaryTree node = construct(pre,post,0,pre.length,0);
		Traversals.preOrder(node);
	}

	private static BinaryTree construct(int[] pre, int[] post, int low, int high,
			int index) {
		// TODO Auto-generated method stub
		if(low>high || index >= high) return null;
		//System.out.println("index: "+index + " val : "+pre[index]);
		BinaryTree node = new BinaryTree(pre[index]); ++index;
		if(low == high) return node;
		for(int i = low;i<high;i++){
			if(pre[index] == post[i]) break;
		}
		
		node.left = construct(pre,post,low,index,index);
		node.right = construct(pre,post,index+1,high,index);
		
		return node;
		
		
		
	}

}
