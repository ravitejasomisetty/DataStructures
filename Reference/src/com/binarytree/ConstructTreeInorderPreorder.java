package com.binarytree;

public class ConstructTreeInorderPreorder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inord[] = {4,2,5,1,6,3,7};
		int preord[] = {1,2,4,5,3,6,7};
		BinaryTree node = construct(inord, preord,0,inord.length-1);
		Traversals.inOrder(node);
	}
	static int preOrdr = 0;
	private static BinaryTree construct(int[] inord, int[] preord, int i, int j) {
		if(i>j) return null;
		BinaryTree node  = new BinaryTree(preord[preOrdr]);preOrdr++;
		if(i==j) return node;
		
		int x=0;
		for(x =0 ; x<inord.length;x++){
			if(node.data == inord[x]) break;
		}
		
		node.left = construct(inord, preord,i,x-1);
		node.right = construct(inord, preord,x+1,j);
		return node;
	}

}
