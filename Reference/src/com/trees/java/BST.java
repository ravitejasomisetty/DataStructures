package com.trees.java;

import java.util.Stack;

public class BST {

	public static BSTnode root;
	public static BSTnode newRoot;
	static BST btree = new BST();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		root = new BSTnode(6);
		newRoot = new BSTnode();
		btree.insert(5);
		btree.insert(1);
		btree.insert(3);
		btree.insert(2);
		btree.insert(4);
		//iterativeinorder(root);
		preorder(root);
		Flatten(root);
		preorder(newRoot);
	}
	//convert sorted array to bst
	public TreeNode sortedArrayToBST(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        return buildTree(num, 0, num.length-1);
    }
    
    private TreeNode buildTree(int[] num, int start, int end) {
        if(start > end) return null; 
        
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(num[mid]);
        root.left = buildTree(num, start, mid-1);
        root.right = buildTree(num, mid+1, end);
        return root;
    }
	private static BSTnode search(BSTnode root, int i) {
		// TODO Auto-generated method stub
		if(root==null){ return null;}
		if(root.data==i){System.out.println("found" + root.data	);}
		else{
			search(root.left,i);
			search(root.right,i);
		}
		
		return null;
	}
	
	private static BSTnode Flatten(BSTnode root) {
		// TODO Auto-generated method stub
		if(root==null){ return null;}
		
		Flatten(root.left);
		if(root!=null){
			newRoot = insert(newRoot,root.data);
			
		}
		Flatten(root.right);
				
		return null;
	}
	BST(){
	}
	public void insert(int data){
		root = insert(root,data);
	}
	public static BSTnode insert(BSTnode root, int data) {
		// TODO Auto-generated method stub
		if(root == null){
			root = new BSTnode(data);
		}else{
			if(data<root.data){
				root.left = insert(root.left,data);
			}else{
				root.right = insert(root.right,data);
			}
		}
		return root;
	}
	public static void inorder(BSTnode root){
		if(root==null) return;
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}
	public static void preorder(BSTnode root){
		if(root==null) return;
		System.out.println(root.data);
		inorder(root.left);
		
		inorder(root.right);
	}
	public static void iterativeinorder(BSTnode root){
		Stack<BSTnode> s = new Stack<BSTnode>();
		while(root !=null){
			s.push(root);
			root = root.left;
		}
		while(s.size()>0){
			BSTnode node =s.pop();
			System.out.println(node.data);
			if(node.right!=null){
				node = node.right;
				while(node !=null){
					s.push(node);
					node = node.left;
				}
			}
		}
	}
	
	public static void iterativepreorder(BSTnode root){
		Stack<BSTnode> s = new Stack<BSTnode>();
		s.push(root);
		while(s.size()>0){
			System.out.println(root.data);
			
		}
		
	}
}
class BSTnode{
	int data;
	BSTnode right;
	BSTnode left;
	BSTnode(){
		right = null;
		left = null;
	}
	BSTnode(int n){
		right = null;
		left = null;
		data =n;
	}
}
