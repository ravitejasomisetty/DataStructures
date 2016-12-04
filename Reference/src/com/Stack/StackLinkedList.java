package com.Stack;

public class StackLinkedList {

	Node<Character> list;
	char data;
	public StackLinkedList(){
	}
	public void push(char a){
		if(list == null){
			list = new Node<Character>(a);
		}else{
			Node<Character> temp = list;	
			while(temp.next!=null){
				temp = temp.next;
			}
			temp.next = new Node<Character>(a);
		}
	}
	public char  pop(){
		Node<Character> temp = list;
		while(temp.next.next!=null){
			temp = temp.next;
		}
		char boo = temp.next.element;
		temp.next = null;
		return boo;
	}
	public char peek(){
		Node<Character> temp = list;
		while(temp.next!=null){
			temp = temp.next;
		}
		return temp.element;
	}
	public boolean isEmpty(){
			return (list==null);
	}
	
	public static void main(String[] args){
		StackLinkedList stack = new StackLinkedList();
		stack.push('a');
		stack.push('b');
		stack.push('c');
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
	}
	
	
}

