package com.Strings;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 50,b=30;
		swap(a,b);
		swapXOR(a,b);
	}

	private static void swapXOR(int a, int b) {
		// TODO Auto-generated method stub
		a = a^b;
		b = b^a;
		a= a^b;
		System.out.println(a+" "+b);
	}

	private static void swap(int a, int b) {
		// TODO Auto-generated method stub
		a +=b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
	}

}
