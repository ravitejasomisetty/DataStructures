package com.Arrays;

public class MajorityElementSorted {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,3,3,3,10};
		majority(a,3);
	}

	private static void majority(int[] a, int target) {
		// TODO Auto-generated method stub
		int i = binarySearch(a,0,a.length-1,target);
		System.out.println(i);
		if((i+1<=a.length/2) && a[i+a.length/2]== target){
			System.out.println("true");
		}
	}

	private static int binarySearch(int[] a, int low, int high, int target) {
		// TODO Auto-generated method stub
		
		if(low<=high){			
			int mid = (low+high )/2;
			//System.out.println("a[mid] : "+ a[mid] + " target : "+target);
			if((mid==0 || a[mid-1] < target )&& a[mid] == target  ){
				//System.out.println("1");
				return mid;
			}else if(a[mid]<target){
				//System.out.println("2");
				return binarySearch(a,mid+1, high,target);
			}else if(a[mid]>=target){
				//System.out.println("3");
				
				return binarySearch(a,low, mid-1,target);
			}			
		}
		return -1;
	}

}
