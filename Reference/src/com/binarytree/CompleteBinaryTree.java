package com.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class CompleteBinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree root = new BinaryTree().getData();
		//root.left = null;
		boolean flag = checkComplete(root);
		System.out.println(flag);
		System.out.println(checkComplete(root));
	}

	private static boolean checkComplete(BinaryTree root) {
		// TODO Auto-generated method stub
		
		Queue<BinaryTree> queue = new LinkedList<BinaryTree>();
		boolean flag = false;
		queue.add(root);
		while(!queue.isEmpty()){
			BinaryTree temp = queue.remove();
			if(temp.left!=null){
				if(flag){
					return false;
				}
				queue.add(temp.left);
			}else
				flag = true;
			
			if(temp.right!=null){
				if(flag) return false;
				
				queue.add(temp.right);
			}else 
				flag = true;
		}
		return true;
	}
	private static boolean check(BinaryTree root, boolean flag){
		
		if(root == null) return true;
		if(root.left!=null && flag){
			check(root.left,true);
		}else if(root.left!=null && !flag) {
			return false;
		}
		if(root.right!=null && flag){
			check(root.right,true);
		}else if(root.right!=null && !flag) {
			return false;
		}
		
		return false;
	}

}
