package com.binarytree;

public class HeightBalanced {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree root = new BinaryTree().getData();
		System.out.println(check(root));
	}

	

	private static boolean check(BinaryTree root) {
		// TODO Auto-generated method stub
		if(root == null) return true;
		
		if(getHeight(root)==-1)		
		return false;
		else 
			return true;
	}

	private static int getHeight(BinaryTree root) {
		if(root== null) return 0 ;
		int lh = getHeight(root.left);
		int rh = getHeight(root.right);
		if(Math.abs(lh-rh) >1) return -1;
		return Math.max(getHeight(root.left), getHeight(root.right))+1;
	}

}
