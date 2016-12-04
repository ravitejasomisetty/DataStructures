package com.Stack;

public class AuxStack extends StackLinkedList{
	
	char ch;
	StackLinkedList min;
	StackLinkedList stack;
	public AuxStack (){
		stack = new StackLinkedList();
		min = new StackLinkedList();
	}
	
	public void push(char a){
		stack.push(a);
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
	

}
