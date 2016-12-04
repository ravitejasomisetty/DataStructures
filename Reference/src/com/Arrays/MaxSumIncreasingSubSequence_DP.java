package com.Arrays;

public class MaxSumIncreasingSubSequence_DP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 101, 2, 3, 100, 4, 5};
		print(a);
	}

	private static void print(int[] a) {
		// TODO Auto-generated method stub
		int result[] = new int[a.length];
		for(int i=0;i<a.length;i++){
			result[i] = a[i];
		}
		
		for(int i = 1;i<a.length;i++){
			for(int j=0;j<i;j++){
				if(a[i] > a[j] &&  result[i] < result[j]+a[i]){
					result[i] = result[j]+a[i];
				}
			}
		}
		int max = 0;
		for(int i : result){
			if(max < i) max = i;
		}
		System.out.println(max);
	}

}
