package com.Strings;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5));
		Integer[] a = new Integer[5];
		a[2] = null;
	}

	private static int fact(int i) {
		// TODO Auto-generated method stub
		if(i==1 || i==0) return 1;
		return i*fact(i-1);
	}

}
