package com.Arrays;

public class subArraySum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {15,2,4,8,9,5,10,23};
		find(arr,23);
	}

	private static void find(int[] arr, int target) {
		// TODO Auto-generated method stub
		int sum = 0,start =0;
		for(int i=0;i<arr.length;i++){
			if(sum > target){
				sum = sum - arr[start];start++;
			}
			if(sum == target){
				System.out.println("Sum found between %d and %d: "+start+ " "+(i-1));
			}
			
				sum +=arr[i];
		}
	}

}
