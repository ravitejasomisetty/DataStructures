package com.Strings;

public class CountPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count(100));
	}

	private static int count(int count) {
		// TODO Auto-generated method stub
		boolean[] primes = new boolean[count+1];
		
		for(int i=2;i<=count;i++){
			primes[i] = true;
		}
		for(int i=2;i<Math.sqrt(count);i++){
			if(primes[i]){
				for(int j= 2*i;j<count;j=j+i){
					primes[j] = false;
				}
			}
		}
		int n = 0;
		for(int i = 0 ;i<count;i++){
			if(primes[i] ) n++;
		}
		return n;
	}

}
