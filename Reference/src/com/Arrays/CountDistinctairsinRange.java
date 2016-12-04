package com.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class CountDistinctairsinRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 10,max =20;
		String temp = "5,2,-1,7,8,1,25,9";
		String[] spl = temp.split(",");
		int[] ary= new int[spl.length];
		int i = 0;
		for(String s: spl){
			System.out.println(s);
			if(s.length()==1){
				ary[i] = Integer.parseInt(s);
				i++;
			}
		}

		Arrays.sort(ary);
		int first = 0, last = ary.length-1;
		while(first<=last){
			if(ary[first]+ary[last]>=min && ary[first]+ary[last]<= max){
				System.out.println(ary[first]+" "+ary[last]);
				first++; 
			}
			if(ary[first]+ary[last]<=min){
				first++;
			}else{
				last--;
			}
		}

	}

}
