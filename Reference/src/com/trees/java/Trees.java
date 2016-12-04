package com.trees.java;

import java.util.ArrayList;

public class Trees {

	//static int[] path = new  int[10];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(3);
		Node one = new Node(1);
		Node two = new Node(2);
		Node five = new Node(5);
		Node four = new Node(4);
		Node seven = new Node(7);
		Node six = new Node(6);
		root.left =two;
		root.right = five;
		two.left = one;
		five.left = four;
		five.right = six;
		ArrayList<Integer> path =new ArrayList<Integer>();
		FindAllPathsToEnd(root, 0,path );
		//System.out.println(checkBST(root));
	}

	private static void FindAllPathsToEnd(Node root, int index,ArrayList<Integer> path) {
		// TODO Auto-generated method stub
		path.add( root.data);					
			if(root.left!=null){
				FindAllPathsToEnd(root.left,index,path);
			}
			if(root.right!=null){
				FindAllPathsToEnd(root.right,index,path);
			}
			if(root.left==null && root.right == null){
				for(int i: path)
				System.out.print(i);
				System.out.println();
			}		
	}
	private static boolean checkBST(Node root){
		
		if(root==null){
			return true;
		}else if(root.left!= null  && root.left.data>root.data){
			return false;
		}else if(root.right!=null  && root.right.data<root.data){
			return false;
		}
		
		return checkBST(root.left) && checkBST(root.right);
	}

}
class Node{
	int data;
	Node left;
	Node right;
	Node(){}
	Node(int d){
		data = d;
		left= null;
		right = null;
	}
}