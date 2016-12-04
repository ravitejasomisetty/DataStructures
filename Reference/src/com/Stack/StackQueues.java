package com.Stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackQueues {

	char data ;
	Queue<Character> q1;
	Queue<Character> q2;
	public StackQueues(){
		q1 = new LinkedList<Character>();
		q2 = new LinkedList<Character>();
	}
	
	public void push(char a){
		if(q1.peek() == null){
			q1.add(a);
		}else{
			for(int i=q1.size();i>0;i--){
				q2.add(q1.remove());
			}
			q1.add(a);
			for(int i=q2.size();i>0;i--){
				q1.add(q2.remove());
			}
		}		
	}
	public char  pop(){
		return (q1.peek()==null ? null:q1.remove());
	} 
	public char peek(){
		return q1.peek();
	}
	
	public static void main(String[] args){
		StackQueues stack = new StackQueues();
		stack.push('a');
		stack.push('b');
		stack.push('c');
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
	}
	

}
