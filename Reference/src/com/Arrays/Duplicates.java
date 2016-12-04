package com.Arrays;

public class Duplicates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,5,3,4,2,3,6};
		find(arr);
	}

	private static void find(int[] arr) {
		for(int i=0;i<arr.length;i++){
			if(arr[Math.abs(arr[i])]>0){
				arr[Math.abs(arr[i])] = - arr[Math.abs(arr[i])];
			}else{
				System.out.println(Math.abs(arr[i]));
			}
		}
	}

}
