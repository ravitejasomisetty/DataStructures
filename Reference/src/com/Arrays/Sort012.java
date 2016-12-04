package com.Arrays;

public class Sort012 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,2,1,1,1,0,2,0};
		sort(arr);
	}

	private static void sort(int[] arr) {
		// TODO Auto-generated method stub
		int low =0,mid=0,high= arr.length-1;
		while(mid <= high){
			switch(arr[mid]){
			case 0: swap(low,mid,arr); low++;mid++; break;
			case 1: mid++;
			case 2 : swap(mid,high,arr); high--; break;
			}
		}
		for(int i : arr){
			System.out.println(i);
		}
	}
	private static void swap(int a, int b,int[] arr){
		int temp = arr[a];
		arr[a]	= arr[b];
		arr[b]	= temp;
	}

}
