package com.Arrays;

public class IncrementNumberFromCharArray {

	public static void main(String[] args) {
		char num[] = {'1','2','3'};
		int x = 0;
		for(char n : num){
			x = 10*x+ n -'0';
		}
		System.out.println(x);
		System.out.println('b');
	}

}
