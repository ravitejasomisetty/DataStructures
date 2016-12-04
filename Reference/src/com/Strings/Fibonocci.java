package com.Strings;

public class Fibonocci {
	static int[] fib ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 10;
		fib = new int[10+1];
		fibnocci(count);
		for(int i=0;i<fib.length;i++){
			System.out.print(fib[i]+ " ");
		}
	}
	private static int fibnocci(int count) {
		// TODO Auto-generated method stub
		if(fib[count]>0) return fib[count];
		
		if(count<=1){ fib[count] = 1; return 1;}
		else
		
		fib[count] = fibnocci(count-1)+fibnocci(count-2);		
		return fib[count];
	}

}
