package com.BST;

import java.util.Stack;

public class Traversals {

	public static void main(String[] args) {
		BST head = new BST().getData();
		inOrder(head);
		System.out.println("Iterative inorder");
		inOrderIterative(head);
		System.out.println();
		MoorsInorder(head);
		System.out.println("pre order recursive");
		preOrder(head);
		System.out.println();
		MoorsPreorder(head);
		System.out.println();
		preOrderIterative(head);
		System.out.println();
		postOrder(head);
		
	}

	private static void MoorsInorder(BST head) {
		// TODO Auto-generated method stub
		if(head == null) return;
		System.out.println("Moors inorder");
		BST current = head;
		BST pre = null;
		
		while(current!=null){
			if(current.left ==null){
				System.out.print(current.data+ " ");
				current = current.right;
			}else{
				pre = current.left;
				while(pre.right!=null && pre.right!=current){
					pre = pre.right;
				}
				if(pre.right==null){					
					pre.right= current;
					current = current.left;
				}
				else{
					pre.right = null;
					System.out.print(current.data+ " ");
					current = current.right;
				}
			}
			
		}
	}

	private static void MoorsPreorder(BST head) {
		// TODO Auto-generated method stub
		if(head == null) return;
		System.out.println("Moors Preorder");
		BST current = head;
		BST pre = null;
		
		while(current!=null){
			if(current.left ==null){
				System.out.print(current.data+ " ");
				current = current.right;
			}else{
				pre = current.left;
				while(pre.right!=null && pre.right!=current){
					pre = pre.right;
				}
				if(pre.right==null){	
					System.out.print(current.data+ " ");
					pre.right= current;
					current = current.left;
				}
				else{
					pre.right = null;					
					current = current.right;
				}
			}
			
		}
	}
	private static void preOrderIterative(BST head) {
		// TODO Auto-generated method stub
		if(head == null) return ;
		System.out.println("preOrderWithoutRecurssion");
		Stack<BST> s1 = new Stack<BST>();
		s1.push(head);
		while(!s1.isEmpty()){
			BST temp = s1.pop();
			System.out.print(temp.data+ " ");
			if(temp.right!=null){
				s1.push(temp.right);
			}
			if(temp.left!=null)s1.push(temp.left);
		}
	}

	private static void inOrderIterative(BST root) {
		System.out.println("inOrderWithoutRecurssion");
		if(root == null) return;
		Stack<BST> s1 = new Stack<BST>();
		while(root!=null){
			s1.push(root);
			root = root.left;
		}
		while(!s1.isEmpty()){
			BST temp = s1.pop();
			System.out.print(temp.data+ " ");
			if(temp.right!=null){				
				temp = temp.right;
				while(temp!=null){
					s1.push(temp);
					temp = temp.left;
				}
			}
		}
	}

	public static void postOrder(BST head) {
		if(head == null) return;		
		preOrder(head.left);		
		preOrder(head.right);
		System.out.print(head.data + " ");

	}

	public static void preOrder(BST head) {
		if(head == null) return;
		System.out.print(head.data + " ");
		preOrder(head.left);		
		preOrder(head.right);
	}

	public static void inOrder(BST head) {
		if(head == null){
			//System.out.print("Null");
			return;
		}
		inOrder(head.left);
		System.out.print(head.data + " ");
		inOrder(head.right);
	}

}
