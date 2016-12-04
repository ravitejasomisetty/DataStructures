package com.BST;



public class BST {

	int data = 0;
	BST left,right;
	public BST(int data){
		this.data = data;
		left = null;
		right = null;
	}
	public BST(){

	}

	public static BST insert(BST node,int key){
		if(node == null) return new BST(key);
		if(node.data < key) node.right = insert(node.right, key);
		else if(node.data > key) node.left = insert(node.left, key);
		return node;
	}

	public static BST search(BST node,int key){
		if(node == null || node.data == key){

			return node;
		}
		if(node.data < key){

			return search(node.right, key);
		}
		return search(node.left, key);
	}
	public static BST delete(BST root , int key){
		if(root  == null) return root;
		if(root.data <key)root.right=delete(root.right,key);
		else if(root.data >key)root.left=delete(root.left,key);
		else{
			if(root.left== null){
				root= root.right;
				return root;
			}else if(root.right==null){
				root = root.left;
				return root;
			}
			BST temp = getMinVal(root.right);
			root.data = temp.data;
			root.right = delete(root.right,temp.data);
		}
		return root;
	}

	private static BST getMinVal(BST node) {
		//System.out.println(node.data);
		// TODO Auto-ge1nerated method stub
		while(node.left!=null){
			node = node.left;
		}
		System.out.println(node.data);
		return node;
	}
	public static void main(String[] args){
		BST head = new BST().getData();
		System.out.println(search(head, 7).data);
		head = delete(head, 7);
		Traversals.inOrder(head);
	}

	public BST getData() {
		BST root = new BST(4);		
		BST.insert(root, 2);
		BST.insert(root, 1);
		BST.insert(root, 3);
		BST.insert(root, 6);
		BST.insert(root, 5);
		BST.insert(root, 7);
		return root;
	}
}
