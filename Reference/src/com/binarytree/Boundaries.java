package com.binarytree;

public class Boundaries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree root = new BinaryTree().getData();
		printBoundaries(root);
	}

	private static void printBoundaries(BinaryTree root) {
		// TODO Auto-generated method stub
		if(root == null) return ;
		printLeftNodes(root);
		printLeafNodes(root.left);
		printLeafNodes(root.right);
		printrightNodes(root.right);
	}

	private static void printrightNodes(BinaryTree root) {
		// TODO Auto-generated method stub
		if(root== null) return;

		if(root.right!=null){
			System.out.println(root.data);
			printLeftNodes(root.right);
		}
		else if(root.left!=null){
			System.out.println(root.data);
			printLeftNodes(root.left);
		}
	}

	private static void printLeafNodes(BinaryTree node) {
		// TODO Auto-generated method stub
		if(node== null) return;
		printLeafNodes(node.left);
		if(node.left== null && node.right==null){
			System.out.println(node.data);
		}
		printLeafNodes(node.right);
	}

	private static void printLeftNodes(BinaryTree root) {
		// TODO Auto-generated method stub
		if(root== null) return;

		if(root.left!=null){
			System.out.println(root.data);
			printLeftNodes(root.left);
		}
		else if(root.right!=null){
			System.out.println(root.data);
			printLeftNodes(root.right);
		}
	}

}
