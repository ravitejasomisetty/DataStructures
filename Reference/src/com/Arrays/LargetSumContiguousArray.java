package com.Arrays;

public class LargetSumContiguousArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,3,4,-1,11,-12,2,-4,-9};
		largestSum(a);
	}

	private static void largestSum(int[] a) {
		int currentMax = 0,maxTillNow = 0;
		for(int i: a){
			currentMax = max(i,currentMax+i);
			maxTillNow = max(maxTillNow,currentMax);
		}
		System.out.println(maxTillNow);
	}

	private static int max(int x, int y) {
		return (x>y?x:y);
	}

}
