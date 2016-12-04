package com.Strings;

public class Combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("");
			combine("abc",sb,0);
	}

	private static void combine(String input, StringBuilder sb, int index) {
		// TODO Auto-generated method stub
		for(int i=index;i<input.length();i++){
			sb.append(input.charAt(i));
			System.out.println(sb.toString());
			if(i<input.length())
				combine(input,sb,index+1);
			sb.setLength(sb.length()-1);
		}
	}

}
