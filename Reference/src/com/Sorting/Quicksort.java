package com.Sorting;

public class Quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,3,6,1,7,2};
		quick(arr,0,arr.length-1);
		for(int i :arr){
			System.out.print(i+" ");
		}
	}

	private static void quick(int[] arr, int i, int length) {
		if(arr.length == 0) return;
		if(i>=length) return;
		int lt = i,rt = length;
		int mid = lt + (rt-lt)/2;
		
		while(lt<=rt){
			while(arr[lt] < arr[mid])
				lt++;
			while(arr[rt] > arr[mid])
				rt--;
			if(lt<=rt){
				int tmp = arr[lt];
				arr[lt] = arr[rt];
				arr[rt] = tmp;
				lt++;rt--;
			}
		}
		if(i < rt) quick(arr,i,rt);
		if(length > lt) quick(arr,lt,length);
	}

}
