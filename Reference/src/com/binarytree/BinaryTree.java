package com.binarytree;

public class BinaryTree {

	int data;
	BinaryTree left,right;
	public BinaryTree(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public BinaryTree(){}
	
	public BinaryTree getData(){
		BinaryTree one = new BinaryTree(1);
		BinaryTree two = new BinaryTree(2);
		BinaryTree three = new BinaryTree(3);
		BinaryTree four = new BinaryTree(4);
		BinaryTree five = new BinaryTree(5);
		BinaryTree six = new BinaryTree(6);
		BinaryTree seven = new BinaryTree(7);
		BinaryTree eight = new BinaryTree(8);
		BinaryTree nine = new BinaryTree(9);
		one.left = two;
		one.right = three;
		three.left = six;
		three.right = seven;
		two.left = four;
		two.right = five;
		
		//five.right = eight;
		//eight.right = nine;
		return one;
	}
	public BinaryTree getChildrenPropertyData(){
		BinaryTree ten = new BinaryTree(10);
		BinaryTree 	eight = new BinaryTree(8);
		BinaryTree two = new BinaryTree(2);
		BinaryTree temp = new BinaryTree(2);
		BinaryTree three = new BinaryTree(3);
		BinaryTree five = new BinaryTree(5);
		BinaryTree one = new BinaryTree(1);
		ten.left = eight;
		ten.right = two;
		eight.left = three;
		eight.right = five;
		two.left = temp;
	//	five.right = eight;
		return ten;
	}
	
	public BinaryTree getSumTreeData(){
		BinaryTree ten = new BinaryTree(20);
		BinaryTree 	eight = new BinaryTree(8);
		BinaryTree two = new BinaryTree(2);
		BinaryTree temp = new BinaryTree(2);
		BinaryTree three = new BinaryTree(3);
		BinaryTree five = new BinaryTree(5);
		BinaryTree one = new BinaryTree(1);
		ten.left = eight;
		ten.right = two;
		eight.left = three;
		eight.right = five;
		two.left = temp;
	//	five.right = eight;
		return ten;
	}
	

}
