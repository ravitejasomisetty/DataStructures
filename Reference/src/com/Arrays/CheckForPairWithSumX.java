package com.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckForPairWithSumX {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,6,9,4,8,1,11,12};
		//TwoSumProb(arr,12);
		MapSolution(arr,12);
	}

	private static void MapSolution(int[] arr,int k) {
		// TODO Auto-generated method stub
		Map<Integer,Boolean> map = new HashMap<Integer,Boolean>();
		for(int i : arr){
			if(map.get(i)==null){
				map.put(k-i, true);
			}else{
				System.out.println(i + " "+(k>i?k-i:i-k));
			}
		}
	}

	private static void TwoSumProb(int[] arr,int target) {
		
		Arrays.sort(arr);
		//System.out.println(arr.toString());
		int left = 0;
		int right = arr.length-1;
		while(left<right){
			if(arr[right] + arr[left] == target){
				System.out.println(arr[left] + " "+arr[right]);
				right--;
				left++;
			}else if(arr[right] + arr[left] < target){
				left++;
			}else{
				right--;
			}
		}
		System.out.println();
	}	
}
