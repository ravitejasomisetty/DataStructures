package com.Arrays;

public class ArrayRotation {

	
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6};
		int d =2;
		rotate(a,d-1);
	}

	private static void rotate(int[] a,int d) {
		reverse(a,0,d);
		reverse(a,d+1,a.length-1);
		reverse(a,0,a.length-1);
		for(int j :a){
			System.out.print(j+ " ");
		}
	}

	private static void reverse(int[] a, int i, int d) {
		int start=i,end =d;
		while(start<end){
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;end--;			
		}
		
	}

}
