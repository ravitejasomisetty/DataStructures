package com.Strings;

public class AtoI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = "1234";
		System.out.println(convert(num));
	}

	private static int convert(String num) {
		if(num.length()<=1) return num.charAt(0);
		boolean flag = false;
		int index = 0;
		if(num.charAt(0)=='-'){
			flag = !flag; index++;
		}
		int res =0 ;
		while(index <num.length()){
			res = res*10 + num.charAt(index++)-'0';
		}		
		return res;
	}

}
