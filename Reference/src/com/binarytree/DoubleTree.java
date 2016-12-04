package com.binarytree;

public class DoubleTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree root = new BinaryTree().getData();
		root = construct(root);
		Traversals.inOrder(root);
	}

	private static BinaryTree construct(BinaryTree root) {
		// TODO Auto-generated method stub
		if(root == null) return null;
		construct(root.left);
		construct(root.right);
		BinaryTree temp = root.left;
		root.left = new BinaryTree(root.data);
		root.left.left = temp;
		
		return root;
	}

}
