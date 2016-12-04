package com.Strings;

public class MultiplicationOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res = multiply("12","12");
		System.out.println(res);
	}

	private static String multiply(String s1, String s2) {
		s1 = new StringBuilder(s1).reverse().toString();
		s2 = new StringBuilder(s2).reverse().toString();
		int res[] = new int[s1.length()+s2.length()];
		
		for(int i=0;i<s1.length();i++){
			for(int j=0;j<s2.length();j++){
				res[i+j] +=(s1.charAt(i)-'0') * (s2.charAt(j)-'0');
			}
		}
		StringBuilder sb = new StringBuilder();
		
		for(int  i=0;i<res.length;i++){
			int mod = res[i]%10;
			int car = res[i]/10;
			if(i+1<res.length){
				res[i+1]+=car;
			}
			sb.insert(0, mod);
		}
		while(sb.charAt(0) == '0' && sb.length()> 1){
	        sb.deleteCharAt(0);
	    }
		
		
		return sb.toString();
	}

}
