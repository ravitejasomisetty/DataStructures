package com.Strings;

public class MaxCharinString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "testisngsa";
		char[] arr = new char[256];
		int max = 0;
		for(int i=0;i<input.length();i++){
			arr[input.charAt(i)]++;
			if(arr[input.charAt(i)] >= max){
				max = i;
			}
		}
		System.out.println(input.charAt(max));		
	}

}
