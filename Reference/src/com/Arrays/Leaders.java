package com.Arrays;

public class Leaders {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {16,17,4,3,5,2};
		int max = 0;
		for(int i = a.length-1;i>0;i--){
			max = max(a[i],max);
			if(max == a[i]){
				System.out.println(a[i]);
			}
		}
	}
	private static int max(int i, int j) {
		return (i>j?i:j);
	}

}
