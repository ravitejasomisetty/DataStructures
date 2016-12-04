package com.random;


public class binaryTree {
	static Node1 node ;
	public binaryTree(int d ){
		node = new Node1(d);
	}
	public void addNode(Node1 root, Node1 child, String input){
		if(input.equalsIgnoreCase("l")){
			node.setLeft(child);
		}else{
			node.setRight(child);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node1 n1 = new Node1(2);
		Node1 n2 = new Node1(3);
		Node1 n3 = new Node1(4);
		binaryTree bt = new binaryTree(1);
		bt.addNode(node, n1, "l");
		bt.addNode(node, n1, "l");
		bt.addNode(node, n1, "r");
	}

}

class Node1{
	int data;
	Node1 left;
	Node1 right;
	public Node1(int d){
		data = d;
		left = null;
		right = null;
	}
	public void setRight(Node1 child) {
		Node1 parent = this;
		if(parent.right==null){
			this.right = child;
		}else{
			
		}
	}
	public void setLeft(Node1 child) {
		// TODO Auto-generated method stub

	}




}
