package com.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class ConvertLeftRightToBottomRight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTree node = new BinaryTree().getData();
		convert(node);
	}

	private static void convert(BinaryTree node) {
		// TODO Auto-generated method stub
		Queue<BinaryTree> queue = new LinkedList<BinaryTree>();
		queue.add(node);
		BinaryTree prev= null,first = node;
		while(true){
			int count = queue.size();
			if(count ==0){
				break;
			}
			prev = null;
			while(count >0){
				BinaryTree temp = queue.poll();
				if(temp.left!=null) queue.add(temp.left);
				if(temp.right!=null) queue.add(temp.right);
				if(prev == null){
					first.left = temp;
					first = temp;
				}else{
					prev.right = temp;
					temp.left = null;
				}
				prev = temp;
				count--;
			}
			prev.right =null;
		}
		downRightTraversal(node);
	}
	static void downRightTraversal(BinaryTree root)
	{
	    if (root != null)
	    {
	        System.out.println(root.data);
	        downRightTraversal(root.right);
	        downRightTraversal(root.left);
	    }
	}

}
