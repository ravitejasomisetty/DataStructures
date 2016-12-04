package com.linkedLists;



public class CircularLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(0);
		root.InsertData(1);
		root.InsertData(2);
		root.InsertData(3);
		root.InsertData(4);
		root.InsertData(5);
		//root.InsertData(3);
		Node fin = new Node(10);
		root = circular(root);
		fin.next = root;
	//System.out.println(fin.next.data);
		StartNodefCLL(fin);
	}

	private static Node circular(Node root) {
		// TODO Auto-generated method stub
		Node dummy = root;
		Node temp = root;
		while(root.next.next!=null){
			root = root.next;
		}
		root = root.next;
		root.next =dummy;
		Node mew = root;
		return mew;
	}

	private static void StartNodefCLL(Node root) {
		// TODO Auto-generated method stub
		//System.out.println("cmg");
		
		Node slow = root;
		Node fast = root;
		boolean flag = false;
		while(fast!=null && fast.next!=null){
			
			slow = slow.next;
			fast = fast.next.next;
			System.out.println("slow.data>>>"+slow.data+" fast>>"+fast.data);
			if(slow==fast){
				flag = true;
				break;
			}
			if(fast==null){
				System.out.println("Not FOund");
			}
			
			//root = root.next;
			
		}
		if(flag){
			slow = root;
			while(slow!=null){
				if(slow==fast){
					System.out.println("ochindoch!: "+slow.data);
					break;
				}
				slow = slow.next;
				fast= fast.next;
			}
		}else{
			System.out.println("Not Found!");
		}
		
	}

}
class Node {
	int data;
	public Node next ;	
	public Node(){}

	public Node(int d){
		data = d;
	}
	public void InsertData(int data){
		Node end = new Node(data);
		Node node = this;
		while(node.next != null){
			node = node.next;
		}
		node.next = end;
		end.next = null;		
	}

}