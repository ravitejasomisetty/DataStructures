package com.Arrays;

public class FindTwoOddNumbersOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,1,2,2,3,3,4,8};
		int xor = 0;
		for(int i=0;i<a.length;i++){
			xor =  xor ^ a[i];
		}
		int setBit   = xor & ~(xor-1);
		System.out.println(setBit);
		int x = 0,y = 0;
		for(int i = 0;i<a.length;i++){
			System.out.println("analysis : "+ (setBit & a[i]));
			if((setBit & a[i]) ==0 ){
				System.out.println("even  : "+a[i]);
				x = x ^ a[i];
			}else{
				y  = y ^ a[i];
				System.out.println("odd : "+a[i]);
			}
		}
		System.out.println("x : "+x + " y : "+y);
	}

}
