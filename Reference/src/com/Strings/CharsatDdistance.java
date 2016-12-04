package com.Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class CharsatDdistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input ="geeksforgeeks";

		reArrange(input,3);
	}

	private static void reArrange(String input, int d) {
		// TODO Auto-generated method stub
		ArrayList<Character> set = new ArrayList<Character>();
		for(int i=0;i<input.length();i++){
			set.add(input.charAt(i));
		}
		Collections.sort(set,new Comparator<Character>() {

			public int compare(Character arg0, Character arg1) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		});

		Character temp =set.get(0);
		StringBuilder sb = new StringBuilder();
		sb.setLength(input.length());
		int tem = 0;int i=0;
		for(Character c: set){
			//System.out.println(sb.toString());
			if(temp.equals(c)){
				sb.setCharAt(i, c);
			}else{
				
				temp = c;
				tem++;
				i=tem;
				sb.setCharAt(i, c);
			}
			i =i+d;
		}
		System.out.println(sb.toString());
	}

}
class chara{
	Character c;
	int count;
	
}