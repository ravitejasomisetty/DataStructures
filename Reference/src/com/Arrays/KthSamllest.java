package com.Arrays;

import java.util.Arrays;

public class KthSamllest {
// Largest not smallest
	public static void main(String[] args) {
		int arr[] = {7,10,4,3,20,15};
		//quick(arr,0,arr.length-1,4);
		int k = 4;
		int res = getKth(k, arr, 0, arr.length - 1);
		for(int i :arr){
		//	System.out.print(i+" ");
		}
		System.out.println("res::: "+res);
		
	}
	
	public static int getKth(int k, int[] nums, int start, int end) {
		 
		int pivot = nums[end];
	 
		int left = start;
		int right = end;
	 
		while (true) {
	 
			while (nums[left] < pivot && left < right) {
				left++;
			}
	 
			while (nums[right] >= pivot && right > left) {
				right--;
			}
	 
			if (left == right) {
				break;
			}
	 
			swap(nums, left, right);
		}
	 
		swap(nums, left, end);
	 
		if (k == left + 1) {
			for(int i:nums){
				System.out.print(i+ " ");
			}
			return pivot;
		} else if (k < left + 1) {
			System.out.println("left>>>: "+nums[left-1]);
			return getKth(k, nums, start, left - 1);
		} else {
			System.out.println("rt>>>: "+nums[left+1]);
			return getKth(k, nums, left + 1, end);
		}
	}
	 
	public static void swap(int[] nums, int n1, int n2) {
		System.out.println(n1+"  left: "+nums[n1]+" right: "+nums[n2]);
		int tmp = nums[n1];
		nums[n1] = nums[n2];
		nums[n2] = tmp;
	}
	

	private static void quick(int[] arr, int start, int end,int k) {
		if(arr.length == 0) return;
		if(start>end) return;
		int lt = start,rt = end;
		int mid = lt + (rt-lt)/2;
		
		while(lt<=rt){
			//System.out.println("io");
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
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("lt: "+lt + " rt: "+ rt);
		if(lt>rt){
			int tmp = arr[lt];
			arr[lt] = arr[mid];
			arr[mid] = tmp;
		}
		if(k == lt+1) {System.out.println(arr[k]); return;};
		if(k < lt+1) quick(arr,start,lt-1,4);
		else quick(arr,lt+1,end,4);
		System.out.println(Arrays.toString(arr));
	}

}
