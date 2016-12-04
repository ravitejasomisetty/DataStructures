package com.Stack;


public class StackArray {
	int top ;
	char sArray[];
	int max;
	public StackArray(int data){
		top = -1;
		sArray = new char[data];
		max = data;
	}
	public char push(char a){
		return sArray[++top] =a;
	}
	public char  pop(){
		return sArray[top--];
	}
	public char peek(){
		return sArray[top];
	}
	public boolean isEmpty(){
			return (top==-1);
	}
	public boolean isFull(){
		return top==max-1;
	}
	
	public static void main(String[] args){
		StackArray stack = new StackArray(7);
		stack.push('a');
		stack.push('b');
		stack.push('c');
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
	}
}
