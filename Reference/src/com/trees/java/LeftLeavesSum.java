package com.trees.java;

public class LeftLeavesSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BSTnode root ;
		BST btree = new BST();
		root = btree.root;
		root = new BSTnode(20);
		btree.insert(root,9);
		btree.insert(root,5);
		btree.insert(root,12);
		btree.insert(root,15);
		btree.insert(root,49);
		btree.insert(root,52);
		btree.insert(root,50);
		btree.insert(root,23);
		sum(root);
		//btree.inorder(root);
	}

	private static void sum(BSTnode root) {
		// TODO Auto-generated method stub
		int sum = 0;
		System.out.println(inorder( root,sum));
	}

	private static int inorder(BSTnode root, int sum) {
		// TODO Auto-generated method stub
		sum = 0;
		if(root == null) return sum;
		if(root!=null){
			if(Isleaf(root.left)){
				System.out.println("leadnode: "+root.left.data);
				sum = sum+ root.left.data;
			}else{
				sum = sum+inorder(root.left,sum);
			}
			sum +=inorder(root.right,sum);
		}
		
		return sum;
	}
	static boolean Isleaf(BSTnode root){
		if(root == null ) return false;
		if(root.left== null && root.right == null) return true;
		return false;
	}

}
