package com.Stack;

public class TwoStacks {

	/**
	 * @param args
	 */
	int arr[];
	int top1,top2,size;
	private TwoStacks(int data){
		arr = new int[data];
		top1 =-1;
		top2 = data;
		size = data;
	}

	public void push1(int a){
		System.out.println(top1 + "  "+top2);
		if(top1 <top2-1){
			top1++;
			arr[top1] = a;
		}else{
			System.out.println("Overflow");
		}
		
	}
	public void push2(int a){
		if(top1 < top2-1){
			top2--;
			arr[top2] = a;
		}else{
			System.out.println("Overflow");
		}
		
	}	
	public int pop1(){
		if(top1 >= 0){
		return arr[top1--];
		}else{
			System.out.println("Underflow");
			return Integer.MIN_VALUE;
		}
	}
	public int  pop2(){
		if(top2 < size){
			int ap =  arr[top2];
			top2++;
			return ap;
			}else{
				System.out.println("Underflow");
				return Integer.MIN_VALUE;
			}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoStacks stack = new TwoStacks(4);
		stack.push1(1);
		System.out.println(stack.pop1());
		stack.push1(2);
		stack.push2(4);
		stack.push2(3);
		System.out.println(stack.pop1());
		System.out.println(stack.pop2());
	}

}
