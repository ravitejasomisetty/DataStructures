package com.BST;

public class FindSuccPre {

	/**
	 * @param args
	 */
	static int succ=0,pre=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST root = new BST().getData();
		Traversals.inOrder(root);
		System.out.println();
		find(root,6);
		System.out.println("succ : "+succ);
		System.out.println("pre : "+pre);
	}

	private static void find(BST root,int target) {
		// TODO Auto-generated method stub
		if(root == null) return;
		if(root.data > target){
			succ = root.data;
			find(root.left,target);
		}
		else if(root.data<target){
			pre = root.data;
			find(root.right,target);
		}
		else{
			BST temp = root;
			if(temp.right!=null){
				temp = temp.right;
				while(temp.left!=null){
					temp= temp.left;
				}
				succ = temp.data; 
			}
			temp = root;
			if(temp.left!=null){
				temp = temp.left;
				while(temp.right!=null){
					temp= temp.right;
				}
				pre = temp.data;
				
			}
			return;
		}
	}

}
