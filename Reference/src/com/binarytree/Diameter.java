package com.binarytree;

public class Diameter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree root = new BinaryTree().getData();
		System.out.println(diameter(root));
		int[] result = diameterOptimzed(root);
		System.out.println(result[0]);
	}

	private static int[] diameterOptimzed(BinaryTree root) {	
		int[] result = new int[2];
		if(root == null) return result;
		int[] lDiameter = diameterOptimzed(root.left);
		int[] rDiameter = diameterOptimzed(root.right);
		int height  = Math.max(lDiameter[1],rDiameter[1])+1;
		int rootDiameter = 1 + lDiameter[1]+rDiameter[1];
		result[0] = Math.max(rootDiameter, Math.max(lDiameter[0],rDiameter[0])+1);
		result[1] = height;
		return result;
	}

	private static int diameter(BinaryTree root) {
		// TODO Auto-generated method stub
		if(root== null) return 0 ;
		int lheight = getHeight(root.left);
		int rheight = getHeight(root.right);
		int ldim = diameter(root.left);
		int rdim = diameter(root.right);
		return Math.max(rheight+lheight+1,Math.max(ldim, rdim));
	}

	private static int getHeight(BinaryTree root) {
		if(root== null) return 0 ;		
		return Math.max(getHeight(root.left), getHeight(root.right))+1;
	}

}
