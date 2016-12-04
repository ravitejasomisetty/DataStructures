package com.Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = 10;
		int[] arr = {-3,-2,-1,0,1,9,5,4,5,8,2,13};
		Arrays.sort(arr);
		threeSum(arr,target);		
	}

	

	private static void threeSum(int[] arr, int target) {
		for(int i =0;i<arr.length;i++){
			Twosum(arr,target-arr[i],i);
		}
	}


	private static void Twosum(int[] arr, int target, int first) {
		int temp = arr[first];
		int last = arr.length-1;
		while(first<last){
			if(arr[first]+arr[last]==target){
				System.out.println(temp+" "+arr[first]+" "+arr[last]);
			}
			if(arr[first]+arr[last]>target){
				last--;
			}else{
				first++;
			}
		}
	}

}
