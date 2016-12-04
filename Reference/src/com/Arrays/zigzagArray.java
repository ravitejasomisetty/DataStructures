package com.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class zigzagArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr  = {4, 3, 7, 8, 6, 2, 1};
		arr = wiggleArrangeArray(arr);
		for(int  i: arr){
			System.out.print(i+" ");
		}
		System.out.println();
		int arr1[] = {4, 3, 7, 8, 6, 2, 1};
		arr1 = get(arr1);
		for(int  i: arr1){
			System.out.print(i+" ");
		}
		System.out.println();
		arr1 = get1(arr);
		for(int  i: arr1){
			System.out.print(i+" ");
		}
	}
	static int[] get(int[] arr){
		List<Integer> asc = new ArrayList<Integer>(arr.length);
		List<Integer> dsc = new ArrayList<Integer>(arr.length);
		for(int i : arr){
			asc.add(i);
			dsc.add(i);
		}
		Collections.sort(asc);
		Collections.sort(dsc,Collections.reverseOrder());
		int counter = 0;
		for(int i = 0 ;i<arr.length;i++){
			arr[i] = dsc.get(counter); 
			i++;
			if(i<arr.length)
				arr[i] = asc.get(counter++); 
		}
		return arr;
	}
	static int[] get1(int[] arr){
		List<Integer> asc = new ArrayList<Integer>(arr.length);
		for(int i : arr){
			asc.add(i);
		}
		Collections.sort(asc);
		boolean flag = true;
		int start = 0,end = asc.size()-1;
		for(int i = 0 ;i<arr.length;i++){
			if(flag){
				arr[i] = asc.get(end--);
			}else{
				arr[i] = asc.get(start++);
			}	
			flag =!flag;
		}
		return arr;
	}

	static int[] wiggleArrangeArray(int arr[])
	{
		int n = arr.length;
		boolean flag = true;
		for (int i=0; i<=n-2; i++)
		{
			if (!flag){
				if (arr[i] > arr[i+1])
					swap(arr,i, i+1);
			}
			else{
				if (arr[i] < arr[i+1])
					swap(arr,i, i+1);
			}
			flag = !flag;
		}
		return arr;
		
	}
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}
}




