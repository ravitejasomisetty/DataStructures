package com.Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class Arrays {
	static int[] even = {2,4,6,8};
	static int[] odd = {1,3};
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int[] arr ={-3,-2,-1,0,1,5};
		Scanner sc = new Scanner(System.in);
		//System.out.println("enetr number");
		//int num = sc.nextInt();
		//System.out.println(checknum(num));
		findSubArray(arr);
	}

	private static int checknum(int num) {
		// TODO Auto-generated method stub
		int[] fin =merge();
		num = fin[num];
		return num;
	}

	private static int[] merge() {
		// TODO Auto-generated method stub
		int i=0,j=0,k=0;
		int[] fin = new int[even.length+odd.length];
		while(i< even.length && j <odd.length){
			if(even[i]<odd[j]){
				fin[k]=even[i];i++;
			}else{
				fin[k] = odd[j];j++;
			}
			k++;			
		}
		System.arraycopy( even, i,fin, k, even.length-i);
		return fin;
	}
	// contiguous subarray whose sum is zero
	public static void findSubArray(int [] arr){

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int sum = 0;int SI = 0;int EI = -1;
		for(int i = 0; i < arr.length; i++){
			sum = sum + arr[i];
			if(sum == 0){
				SI = 0; EI = i;
				System.out.println(SI+"  :true: "+EI);}
			else if(hm.containsKey(sum)){
				SI = hm.get(sum)+1;
				EI = i;
				System.out.println(SI+"  :Y: "+EI);
			}
			else{
				hm.put(sum, i);
			}}}

}
