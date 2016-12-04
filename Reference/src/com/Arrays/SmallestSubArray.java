package com.Arrays;

public class SmallestSubArray {
	// sum greater than given value
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1, 4, 45, 6, 0, 19};
		int arr2[] = {1, 11, 100, 1, 0, 200, 3, 2, 1, 250};
		find(arr2,280);
	}

	private static void find(int[] arr, int k) {
		int count = 0,sum = 0,finC = 10,init=0;
		for(int i=0;i<arr.length;i++){
			sum += arr[i];
			count++;
			while(sum >k && init <i-1){
				count--;
				sum -=arr[init++]; 
			}
			if(sum == k && finC>count){
				finC = count;
				System.out.println(init + " -- "+i);
			} 
		}
		System.out.println(finC);
		
		
	}

}
