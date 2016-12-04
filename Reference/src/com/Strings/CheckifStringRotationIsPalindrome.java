package com.Strings;

public class CheckifStringRotationIsPalindrome {

	public static void main(String[] args) {
		String input = "aacbdb";
		check(input);

	}

	private static void check(String input) {
		
		int[] a = new int[256];
		for(char ch : input.toCharArray()){			
			a[(int)ch]++;
		}
		int oddIndex = 0;
		for(char ch : input.toCharArray()){
			if(a[(int)ch]%2!=0){
				oddIndex++;
			}
			if(oddIndex>1){
				System.out.println("Nope"); break;
			}
		}
		
	}

}
