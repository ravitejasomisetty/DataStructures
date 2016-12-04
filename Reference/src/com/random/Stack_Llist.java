package com.random;

public class Stack_Llist {

	Linklist link;
	public Stack_Llist(long d ){
		link = new Linklist(d);
	}
	public void Push(long l){
		
		link.push(l);
	}
	public void Pop(){
		if(IsEmpty()){
		link = link.pop();}else
		{
			System.out.println("Stack was empty");
		}
		
	}
	public void Peek(){
		
		 link.display();
	}
	public boolean IsEmpty(){
		
		 return link.IsEmpty(link);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack_Llist Llist = new Stack_Llist(3);
		Llist.Push(1);
		//Llist.Push(2);
		//Llist.Push(3);
		//Llist.Push(3);
		//Llist.Peek();
		Llist.Pop();
		//Llist.Pop();
		//Llist.Pop();
		Llist.display();
	}
	private void display() {
		// TODO Auto-generated method stub
		link.Display(link);
	}

}

class Linklist{

	long data;
	Linklist next;
	
	public Linklist(long d){
		data = d;
	}
	public Linklist(){
		
	}
	public void push(long d){
		Linklist node = this;
		Linklist newNode = new Linklist(d);
		//newNode.data =d;
		while(node.next!=null){
			node = node.next;
		}
		newNode.next =null;
		node.next = newNode;		
	}
	public Linklist  pop(){
		Linklist node = this;
		//System.out.println("pop: "+node.next);
		Linklist newNode = this;
		//Node node = this;
		boolean flag = false;
		while(node.next!=null){
			flag = true;
			///System.out.println(node.data);
			if(node.next.next != null){
				node = node.next;
			}else{
				node.next= null;}			
		}	
		if(!flag){
			node = null;
		}
		return node;
	}
	
	public boolean display(){
		boolean flag = false;
		Linklist node = this;
		while(node.next!=null){			
			node = node.next;
		}
		System.out.println(node.data);
		if(node!=null){
			flag = true; 
		}
		return flag;
	}
	public boolean IsEmpty(Linklist node){
		boolean flag = false;
		//Linklist node = this;
		//System.out.println(node.data);
		if(node!=null){
			flag = true; 
		}
		return flag;
	}
	public void Display(Linklist node ){
		//Linklist node = this;
		while(node != null){
			System.out.println(node.data);
			node = node.next;
		}
	}

	

}
