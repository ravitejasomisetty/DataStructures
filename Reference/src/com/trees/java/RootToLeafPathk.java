package com.trees.java;

public class RootToLeafPathk {

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
		int level =0;
		delete(root,level);
	}

	private static void delete(BSTnode root, int level) {
		// TODO Auto-generated method stub
		
	}

}
