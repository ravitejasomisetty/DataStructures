package com.binarytree;

public class ConvertToSumTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree node = new BinaryTree().getData();
		System.out.println(convert(node));
		Traversals.inOrder(node);
	}

	private static int convert(BinaryTree node) {
		// TODO Auto-generated method stub
		if(node == null) return 0;
		
		int oldValue = node.data;
		
		node.data = convert(node.left)+convert(node.right);
		
		
		return oldValue+node.data;
	}

}
