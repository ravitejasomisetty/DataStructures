package com.binarytree;

public class ConvertBTToDoublyLinkedList {

	/**
	 * @param args
	 */
	static BinaryTree head,prev;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree node = new BinaryTree().getData();
		convert(node);
		System.out.println(head.right.right.right.right.data);
	}

	private static void convert(BinaryTree node) {
		// TODO Auto-generated method stub		
		if(node == null) return;
		convert(node.left);
		if(prev == null) head = node;
		else{
			node.left = prev;
			prev.right = node; 
		}
		prev = node;
		convert(node.right);
	}

}
