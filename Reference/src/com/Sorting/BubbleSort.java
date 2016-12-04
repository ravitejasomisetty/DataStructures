package com.Sorting;

public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,1,12,-5,16};
		BubbleSort(a);
	}

	private static void BubbleSort(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length-1;j++){
				if(a[j] >a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1]= temp;
				}
			}
		}
		for(int k : a){
			System.out.println(k);
		}
	}

}
