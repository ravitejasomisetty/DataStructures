package com.BST;

public class KthSmallest {

	/**
	 * @param args
	 */
	static int k = 5,count=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST root = new BST().getData();
		getKthMin(root);
	}
	private static void getKthMin(BST root) {
		// TODO Auto-generated method stub
		if(root != null){
			getKthMin(root.left);
			++count;
			if(k== count){
				System.out.println(root.data); return;
			}
			getKthMin(root.right);
			
			
		}
	}

}
