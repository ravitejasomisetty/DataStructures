package com.binarytree;

public class FoldableBT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree root = new BinaryTree().getData();
		System.out.println(check(root.left,root.right));
	}

	private static boolean check(BinaryTree left, BinaryTree right) {
		if(left==null && right ==null) return true;
		if(left== null || right == null) return false;
		return check(left.left,right.right) && check(left.right,right.left);
	}

}
