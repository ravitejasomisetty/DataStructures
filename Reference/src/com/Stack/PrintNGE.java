package com.Stack;

import java.util.Stack;

public class PrintNGE {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {7, 5, 6, 3, 4, 1, 2, 9, 11 };
		PrintNextGE(a);
	}

	private static void PrintNextGE(int[] a){
		Stack<Integer> stack = new Stack<Integer>();
		if(a.length > 0){
			stack.push(a[0]);
		}
		int current = 0;
		//System.out.println(stack.peek());
		for(int i=1;i<a.length;i++){
			int next = a[i];
			//System.out.println("next : "+next);
			if(!stack.isEmpty()){
				current = stack.pop();
				//System.out.println("current : "+current);
				while(next>current){				
					System.out.println(current + " --> "+next);
					if(stack.isEmpty()) break;
					current = stack.pop();
				}
				if(next<=current){
					stack.push(current);
				}
			}
			stack.push(next);
		}
		while (!stack.isEmpty())
	    {
	        current =stack.pop();
	        int next = -1;
	        System.out.println(current + " --> "+next);
	    }
	}

}
