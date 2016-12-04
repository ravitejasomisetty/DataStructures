package com.Strings;

import java.util.HashSet;

public class DeleteAdjacent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "abccba";
		StringBuilder sb = new StringBuilder(input);
		adjrmv(sb);
		HashSet set = new HashSet();
	}
 
	private static void adjrmv(StringBuilder sb) {
		// TODO Auto-generated method stub
	char temp = 'z';
		for(int i=1;i<sb.length();){
			//System.out.println(sb.toString() + " len: "+sb.length());
			if(temp == sb.charAt(i)) sb.deleteCharAt(i);
			else if(sb.charAt(i)==sb.charAt(i-1)){
				//System.out.println(" char1: "+sb.charAt(i) + " char2: "+sb.charAt(i-1));
				temp = sb.charAt(i);
				 sb.deleteCharAt(i);
				sb.deleteCharAt(i-1);
				//System.out.println(sb.toString() + " len: "+sb.length());
				i=1;
			} else i++;
		}
		System.out.println(sb.toString());
	}

}
