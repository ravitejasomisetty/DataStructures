package com.Arrays;

public class MaxDiffBetweenTwoElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {80, 2, 6, 3, 100};
		int max = a[a.length-1], min = a[a.length-1],temp = 0;
		
		for(int i=a.length-2;i>=0;i--){
			if(a[i] > max){
				max = a[i];
				min = a[i];
			}else if(a[i]<min){
				min = a[i];
			}
			//System.out.println("max : "+ max + " min : "+min);
			if(temp < (max - min) ){
				temp = max - min;
			}
		}
		if(temp < (max - min) ){
			temp = max - min;
		}
		System.out.println(temp);
	}

}
