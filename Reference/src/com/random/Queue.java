package com.random;
import java.util.Stack;


public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.insert(1);
		q.insert(2);
		q.insert(3);
		q.remove();
	}
	
	private void remove() {
		// TODO Auto-generated method stub
		int i = s1.pop();
		System.out.println("removed element is : "+i);
	}

	private void insert(int i) {
		// TODO Auto-generated method stub
		if(!s1.isEmpty()){
			while(s1.size()>0)
			s2.push(s1.pop());
			
			s1.push(i);
			
			while(s2.size()>0)
				s1.push(s2.pop());
			
		}else{
			s1.push(i);
		}
		
	}

	Stack<Integer> s1,s2  = null;
	
	Queue(){
		s1 = new Stack<Integer>();
		s2 = new Stack<Integer>();
	}

}
