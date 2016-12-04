package com.Arrays;

public class Equilibrium {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {-7,1,5,2,-4,3,0};
		equilibrium(arr);
	}

	private static void equilibrium(int[] arr) {
		int sum = 0,tempSum = 0;
		for(int i=0;i<arr.length;i++){
			sum += arr[i];
		}
		for(int j=0;j<arr.length;j++){
			tempSum += arr[j];
			if(sum - tempSum == tempSum){
				System.out.println(j);
			}
		}
	}
}
