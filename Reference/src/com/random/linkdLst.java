package com.random;
import java.util.LinkedList;


public class linkdLst {
	public static void main (String[] args){
		Node node = new Node();
		node.InsertData(1);
		node.InsertData(2);
		node.InsertData(3);
		node.InsertData(4);
		node.InsertData(5);
		node.InsertData(6);
		node.pairswap(node);
		//node.moveLasteleFrnt();
		//node.printLastNelmnts(4);
		//node.DeleteEndElmnt();
		//node.Display();

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

	public void Display(){
//		Node node = this;
//		while(node != null){
//			System.out.println(node.data);
//			node = node.next;
		Node node = this;
		Node dummy = this;
		while(node.next == this)
		{
			node = node.next;
		}
		System.out.println(node.data);
	}

	public Node DeletestartElmnt(){
		Node node = this;
		if(node.next!=null){
			Node current = new Node();
			node = node.next;			
			current = node;
			node = current;			
			//System.out.println(node.data);
		}
		return node;
	}
	public void DeleteEndElmnt(){
		Node node = this;
		while(node.next!=null){
			///System.out.println(node.data);
			if(node.next.next != null){
				node = node.next;
			}else{
				node.next= null;}			
		}		
	}

	public void printLastNelmnts(int a) {
		Node first = this;
		Node second = this;
		//int count = 0;
		boolean flag =false;
		while(first.next!=null){
			if(a>0){
				flag = true;				
				first= first.next;				
			}else{
				second = second.next;
				first= first.next;
				//System.out.println(second.data);
			}
			a--;			
		}
		if(flag)
			while(second.next!=null){
				System.out.println(second.data);
				second= second.next;
			}		
	}

	public void moveLasteleFrnt(){
		Node node = this;
		Node temp = this;
		while(node.next.next!=null){
			node = node.next;			
		}
		temp = node.next;
		node.next = null;
		temp.next = this;
		node = temp;
		while(node!=null){
			System.out.println(node.data);
			node = node.next;
		}
	}

	public void reverse(){
		//System.out.println("came");
		Node node = this;
		Node prev = null;
		Node current = this;
		Node next = new Node();
		while(current!=null){			
			next =current.next;
			//System.out.println(next.next.data);
			current.next = prev;
			prev =current;
			current =next;
			//System.out.println(current.data);

		}
		node = prev;
		//System.out.println(current.data);
		while(node!=null){
			System.out.println(node.data);
			node = node.next;
		}
	}

	public void pairswap(Node node){
		Node one = node;
		Node two = null;
		if(node.next!=null){
	    two = node.next;
	    System.out.println(two.data);
		}
	    System.out.println(one.data);
	    if(two == null)
	        return;
	    pairswap(two.next);
	}


}