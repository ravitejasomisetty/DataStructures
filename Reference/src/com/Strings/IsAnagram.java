package com.Strings;

public class IsAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = "cat",input2="act";
		boolean flag = isAnagram(input1,input2);
		System.out.println(flag);
	}

	private static boolean isAnagram(String input1, String input2) {
		// TODO Auto-generated method stub
		if(input1.length()!= input2.length()){
			return false;
		}
		char[] count = new char[256];
		for(char i : input1.toCharArray()){
			count[i]++;
		}
		for(char i : input2.toCharArray()){
			count[i]--;
		}
		for(char i : count){
			if(count[i]>0) return false;
		}
		
		
		return true;
	}

}
