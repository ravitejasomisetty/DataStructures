package com.Strings;

import java.util.HashSet;
import java.util.Set;

public class DifferentBraces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "";
		Set<String> set = new HashSet<String>();
		printBraces(2,0,0,str,set);
	}

	private static Set<String> printBraces(int n, int open, int closed, String str,Set<String> set) {
		// TODO Auto-generated method stub
		System.out.println(str);
		if(!set.contains(str)){
			//System.out.println(str);
			set.add(str);

			if(n==closed ){
				//System.out.println(str);
			}
			if(open<n){
				set = printBraces(n,open+1,closed,str+"{",set); 
			}
			if(closed<open){
				set =printBraces(n,open,closed+1,str+"}",set); 
			}

		}
		return set;

	}

}
