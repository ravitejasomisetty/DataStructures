package com.binarytree;

public class ConvertToChildrenPropertyTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree root = new BinaryTree().getData();
		childrenSum(root);
		Traversals.inOrder(root);
		
	}

	private static void childrenSum(BinaryTree root) {
		// TODO Auto-generated method stub
		if(root == null || (root.left == null && root.right==null)) {
			return;
		}
		else{

			childrenSum(root.left);
			childrenSum(root.right);
			int left=0,right=0;
			if(root.left!=null){
				left = root.left.data;
			}if(root.right!=null){
				right = root.right.data;
			}
			root.data = left+right;

		}}
}


