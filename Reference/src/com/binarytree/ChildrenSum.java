package com.binarytree;

public class ChildrenSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree root = new BinaryTree().getChildrenPropertyData();
		System.out.println(childrenSum(root));
	}

	private static boolean childrenSum(BinaryTree root) {
		// TODO Auto-generated method stub
		if(root == null || (root.left == null && root.right==null)) return true;
		else{
			int left=0,right=0;
			if(root.left!=null){
				left = root.left.data;
			}if(root.right!=null){
				right = root.right.data;
			}
			System.out.println((left+right));
			if((left+right == root.data) && childrenSum(root.left) && childrenSum(root.right)){
				return true;
			}else
				return false;
		}
	}

}
