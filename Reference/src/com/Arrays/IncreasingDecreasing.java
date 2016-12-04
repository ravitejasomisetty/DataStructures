package com.Arrays;

import java.util.Arrays;

public class IncreasingDecreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,5,3,4,7,6,1};
		Arrays.sort(a);
		int b[] = new int[a.length];
		for(int i=a.length-1,j=0;i>=0;i--,j++){
			b[j] = a[i]; 
		}
		for(int  i : b){
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=1;i<a.length;i=i+2){
			swap(i,b);
		}
		for(int  i : b){
			System.out.print(i+" ");
		}
		
	}

	private static void swap(int i, int a[]) {
		// TODO Auto-generated method stub
		int temp = a[i];
		a[i] = a[i+1];
		a[i+1] = temp;
	}

}
