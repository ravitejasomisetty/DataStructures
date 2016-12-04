package com.Strings;

public class CountWordsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "One two          three\n  four\nfive  ";
		find(input);
	}

	private static void find(String input) {
		// TODO Auto-generated method stub
		int val = -1,count=1;
		for(int i=0;i<input.length();i++){
			if(input.charAt(i)==' '||input.charAt(i)=='\n'){
				val =0;
			}else if(val==0){
				val =-1;
				count++;
			}
		}
		System.out.println(count);
	}

}
