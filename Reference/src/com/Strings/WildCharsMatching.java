package com.Strings;

public class WildCharsMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "g*k",s2 = "geek";
		match(s1,s2);
	}

	private static void match(String s1, String s2) {
		boolean flag = false;
		char ch = ' ';
		int i=0,j=0;
		while(true)
			if(s1.charAt(i)== s2.charAt(j)){
				j++;i++;
			}else if(s1.charAt(i)=='*'){
				ch= s2.charAt(j);
			}
		}
		//System.out.println(i+" "+j);
		
	

}
