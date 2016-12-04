package com.Strings;

import java.util.Arrays;

public class LongestSubStringWithoutRepeatedChars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "GEEKSFORGEEKS";
		int[] all = new int[256];
		for(int i = 0;i<input.length();i++){
			all[input.charAt(i)]=-1;
		}
		all[input.charAt(0)] = 0;
		int curLen = 1,maxLen =0,prev = 0;;
		for(int i=1;i<input.length();i++){
			int index = all[input.charAt(i)];
			if(index ==-1 || i-curLen>index){
				curLen++;
			}else{
				if(curLen>maxLen){
					maxLen = curLen;
					System.out.println(input.substring(prev,i));
				}
				curLen=i - index;
				prev = i;
			}
			all[input.charAt(i)] = i;
		}
		System.out.println(maxLen);
		curLen = 0;maxLen =0;prev = 0;
		int fIndex = 0;
		Arrays.fill(all, 0);
		for(int i= 0;i<input.length();i++){
			int index = all[input.charAt(i)];
			//System.out.println(input.charAt(i)+ ": char: "+index);
			if(index ==0 ){
				curLen++;
				all[input.charAt(i)] = -1;
			}else{
				if(curLen>maxLen){
					maxLen = curLen-1;
					fIndex = i;
				}	
				all = new int[256];
				all[input.charAt(i)] = -1;
				prev = i;
			}
		}
		System.out.println(maxLen);
	}

}
