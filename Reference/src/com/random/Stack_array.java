package com.random;

public class Stack_array {

	int top;
	char[] sArray ;
	int MaxSize;
	public Stack_array(int d){
		MaxSize =d;
		sArray = new char[d];
		top = -1;
	}
	public void Push(char l){
		sArray[++top] = l;
	}
	public char pop(){
		return sArray[top--] ;
	}
	public char peek(){
		return sArray[top];
	}
	public boolean IsEmpty(){
		return (top==-1);
	}
	public boolean IsFull(){
		return (top == MaxSize-1);
	}
	private static void display(Stack_array sa) {
		// TODO Auto-generated method stub
		while(!sa.IsEmpty()){
			System.out.println(sa.peek());
			sa.pop();
		}
	}
	private static void Reverse(String input) {
		// TODO Auto-generated method stub
		System.out.println(input);
		Stack_array stack = new Stack_array(input.length());
		for(int i =0;i<input.length();i++){
			stack.Push(input.charAt(i));
			//System.out.println(input.charAt(i));
		}
		StringBuffer sb = new StringBuffer();
		while(!stack.IsEmpty()){
			
			sb.append(stack.pop());
		}
		System.out.println(sb);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse("string");
	}
	
	
}
