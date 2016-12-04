package com.binarytree;

public class ConnectSameLevelNodes {

	/**
	 * @param args
	 */
	static class Node{
		int data;
		Node left;
		Node right;
		Node nextRight;
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
			this.nextRight = null;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node one = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);
		Node five = new Node(5);
		Node six = new Node(6);
		Node seven = new Node(7);
		Node eight = new Node(8);
		Node nine = new Node(9);
		
		one.left = two;
		one.right = three;
		
		two.left = four;
		two.right = five;
		
		three.left = six;
		three.right= seven;
		
		seven.right = nine;
		four.left = eight;
		
		Node temp = one;
		connectNodes(temp);
		
		System.out.println(one.left.left.left.nextRight.data);
		
	}
	private static void connectNodes(Node one) {
		// TODO Auto-generated method stub
		one.nextRight = null;
		connect(one);
	}
	private static void connect(Node root) {
		// TODO Auto-generated method stub
		if(root==null) return;
		if(root.nextRight!=null){
			connect(root.nextRight);
		}
		if(root.left!=null){
			if(root.right!=null){
				root.left.nextRight = root.right;
				root.right.nextRight = getNextRight(root);
			}else if(root.left!=null){
				root.left.nextRight = getNextRight(root);
			}
			connect(root.left);
		}else if(root.right!=null){
			root.right.nextRight = getNextRight(root);
			connect(root.right);
		}else{
			connect(getNextRight(root));
		}
	}
	private static Node getNextRight(Node root) {
		// TODO Auto-generated method stub
		Node temp = root.nextRight;
		while(temp!=null){
			if(temp.left!=null) return temp.left;
			else if(temp.right!=null) return temp.right;
			temp=  temp.nextRight;
		}
		return null;
	}

}
