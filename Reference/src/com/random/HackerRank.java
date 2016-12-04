package com.random;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class HackerRank {
	static boolean flag = true;
	static String output = "";
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
				Scanner in = new Scanner(System.in);
		//        final String fileName = System.getenv("OUTPUT_PATH");
		//        int _N = Integer.parseInt(in.nextLine());
		String input = "abcba";
		int count=0;
		// Assign ans a value of YES or NO, depending on whether or not inputString satisfies the required condition
		//HashMap<Character,Integer> hm = new HashMap<Character, Integer>();

		ZerosOnes(7);
		//System.out.println(count);
	}

	private static void ZerosOnes(int inp) {
		// TODO Auto-generated method stub
		
		BigDecimal input = new BigDecimal(inp);
		long i = 1;
		
		while (true) {
			BigDecimal d = new BigDecimal(Long.toBinaryString(i));
			//System.out.println(d);
			if (d.compareTo(input)>=0 && d.remainder(input) == BigDecimal.ZERO) {
				System.out.println(d);
				break;
			}
			i++;
		}
	}

	private static void Permutation(String prefix, String input) {
		// TODO Auto-generated method stub
		if(input.length()==0){
			if(isPalindrome(prefix)){ output= "YES"; flag =false;} }
		else
			for(int i=0;i<input.length();i++){
				if(flag)
					Permutation(prefix+input.charAt(i),input.substring(0,i)+input.substring(i+1,input.length()));
			}

	}

	public static String Pangram(String input){
		input = input.replace(" ", "");
		System.out.println("given input: "+input);
		input = input.toLowerCase();
		Set<Character> s = new TreeSet<Character>();
		int size = 26;

		for(int i=0;i<input.length();i++){
			if(!s.contains(input.charAt(i))){
				s.add(input.charAt(i));
				size--;
			}
		}
		if(size==0 || size ==1) return "Yes";
		else return "No";
	}
	public static void editable_Palindrome(String input){
		//System.out.println("reached");
		StringBuilder sb = new StringBuilder(input);
		if(isPalindrome(input)) System.out.println("Base case Yes");
		else
			for(int i =0;i<input.length();i++){
				if(isPalindrome(input.substring(0,i)+input.substring(i+1, input.length()))) System.out.println(i);
			}		
	}
	public static boolean isPalindrome(String input){
		System.out.println("Is Pal: "+input);
		return input.equals(new StringBuffer(input).reverse().toString());
	}
}
