package com.Arrays;

public class FloorCeil {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = {1,2,8,10,10,12,19};
		binarySearch(a,0,a.length-1,11);
	}

	private static void binarySearch(int[] a, int low, int high, int k) {

		if(high-low == 1){
			System.out.println("floor : "+a[low]);
			System.out.println("ceil : "+a[high]);
			return;
		}
		int mid = (low+high)/2;
		if(k>a[mid]){
			binarySearch(a,mid,high,k);
		}else{
			binarySearch(a,low,mid,k);
		}

	}

}
