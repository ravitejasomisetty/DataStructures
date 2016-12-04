package com.Stack;

public class Postfix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp = "231*+9-";
		Evalution(exp);
	}

	private static void Evalution(String exp) {
		
		StackArray sArray = new StackArray(exp.length());
		for(int i=0;i<exp.length();i++){
			if(Character.isDigit(exp.charAt(i))){
				sArray.push(exp.charAt(i));	
				System.out.println("peek : "+sArray.peek());
			}else{
				int a = Character.getNumericValue(sArray.pop());
				int b = Character.getNumericValue(sArray.pop());
				System.out.println("a "+a);
				System.out.println("b "+b);
				switch(exp.charAt(i)){
				case '+' :  a = a+b; break;
				case '-' :  a = a-b; break;
				case '*' :  a = a*b; break;
				case '/' :  a = a/b; break;
				}
				System.out.println(a);
				sArray.push(Character.forDigit(a, 10));
				System.out.println("qlq: "+sArray.peek());
			}
		}
		System.out.println(sArray.peek());
		
	}

}
