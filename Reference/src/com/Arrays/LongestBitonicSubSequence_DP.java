package com.Arrays;

public class LongestBitonicSubSequence_DP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 11, 2, 10, 4, 5, 2, 1};
		lbss(arr);
	}

	private static void lbss(int[] arr) {
		int lis[] = new int[arr.length];
		int lds[] = new int[arr.length];
		
		for(int i=0;i<arr.length;i++){
			lis[i] = 1; lds[i] =1;
		}
		
		for(int i=1;i<arr.length;i++){
			for(int j=0;j<i;j++){
				if(arr[i] >arr[j] && lis[i] < lis[j]+1){
					lis[i] = lis[j]+1;
				}
			}
		}
		for(int i=arr.length-2;i>=0;i--){
			for(int j=i;j<arr.length;j++){
				if(arr[i] >arr[j] && lds[i] < lds[j]+1){
					lds[i] = lds[j]+1;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(lis[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++){
			System.out.print(lds[i]+ " ");
		}
		System.out.println();
		int max = lis[0]+lds[0]-1;
		for(int i=0;i<arr.length;i++){
			if(max < lis[i]+lds[i]-1)
				max = lis[i]+lds[i]-1;
		}
		System.out.println(max);
		
		
		
		
	}

}
