package com.Strings;

public class CountPossibleDecodings {

	public static void main(String[] args) {
		String inp = "1234";
		count(inp.toCharArray());

	}

	private static void count(char[] inp) {
		int[] count  = new int[inp.length];
		count[0] = 1;
		count[1] = 1;
		
		for(int i=2;i<inp.length;i++){
			count[i] = 0;
			if(inp[i-1] > '0'){
				count[i] = count[i-1];
			}
			if(count[i-2]<'2' || (count[i-2]=='2' && count[i-1]<7)){
				count[i] += count[i-2];
			}
		}
		System.out.println(count[inp.length-1]);
	}

}
