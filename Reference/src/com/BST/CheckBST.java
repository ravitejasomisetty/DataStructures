package com.BST;

public class CheckBST {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST root = new BST().getData();
		boolean flag = checkBSTorNot(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
		System.out.println(flag);
		flag = checkBSTInOrdr(root);
		System.out.println(flag);
	}
	static BST prev = null;
	private static boolean checkBSTInOrdr(BST root) {
		if(root!=null){
			if(!checkBSTInOrdr(root.left)) return false;
			if(prev !=null && root.data > prev.data) return true;
			prev  = root;
			checkBSTInOrdr(root.right);
		}
		return true;
	}

	private static boolean checkBSTorNot(BST root, int min, int max) {
		// TODO Auto-generated method stub
		if(root == null) return true;
		if(root.data<min ||root.data>max){
			return false;
		}
		return checkBSTorNot(root.left,min,root.data) && checkBSTorNot(root.right,root.data,max);
	}
	
	

}
