package com.binarytree;

public class Ancestors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTree root = new BinaryTree().getData();
		System.out.println(ancestors(root,6));
		
	}

	private static boolean ancestors(BinaryTree root, int target) {
		if(root== null) return false;
		if(root.data == target) return true;
		
		if(ancestors(root.left,target) || ancestors(root.right,target)){
			System.out.println(root.data);
			return true;
		}
		return false;
	}

}
