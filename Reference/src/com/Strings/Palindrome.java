package com.Strings;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "liril";
		System.out.println(IsPalindrome(input));
	}

	private static boolean IsPalindrome(String input) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<input.length()/2;i++){
			if(input.charAt(i)!=input.charAt(input.length()-i-1)){
				return false;
			}
		}
		return true;
	}

}
