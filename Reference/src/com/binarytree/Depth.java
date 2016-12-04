package com.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class Depth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTree root = new BinaryTree().getData();
		System.out.println(findDepth(root));
		//findDepthIterative(root);
	}

	private static void findDepthIterative(BinaryTree root) {
		// TODO Auto-generated method stub
		if(root == null) return;
		Queue<BinaryTree> queue = new LinkedList<BinaryTree>() ;
		queue.add(root); int height = 0;
		while(true){
			int qSize = queue.size();
			if(qSize == 0){
				System.out.println(height); break;
			}
			height++;
			while(qSize>0){
				BinaryTree temp = queue.remove();
				if(temp.left!=null)queue.add(temp.left);
				if(temp.right!=null)queue.add(temp.right);
				qSize--;
			}
		}
	}

	public static int findDepth(BinaryTree root) {
		if(root == null) return 0;
		int leftTree = findDepth(root.left);
		int rightTree = findDepth(root.right);
		return Math.max(leftTree, rightTree)+1;
	}
	

}
