package com.Strings;

public class Permutation {
boolean flag = false;
	public static void main(String[] args) {

		Permutation("","abcd");
	}

	private static String Permutation(String prefix, String input) {
		// TODO Auto-generated method stub
		if(input.length()==0)
			System.out.println(prefix);
		else
		for(int i=0;i<input.length();i++){
			Permutation(prefix+input.charAt(i),input.substring(0,i)+input.substring(i+1,input.length()));
		}
		return input;
	}

}
