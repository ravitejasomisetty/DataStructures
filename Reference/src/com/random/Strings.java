package com.random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Strings {
	static Set<String> lst = new TreeSet<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//wildcards();
		//replace20withspace();
		//NofPlaindromes();
		//deleterepcontchars("");
		//PrintPattern(5);
		getPrimes();
		char[] arr = {'a','b','c'};
		String s = new String(arr);
		System.out.println(s);
		//compressString("aabbbbcccddd");

	}
	private static void compressString(String input) {
		// TODO Auto-generated method stub
		int count =1;
		String temp = "";
		for(int i=1;i<input.length();i++){
			if(input.charAt(i)==input.charAt(i-1)){
				count++;
			}else{
				temp = temp+input.charAt(i-1)+count;
				count=1;
			}
		}
		System.out.println(temp+input.charAt(input.length()-1)+count);

	}
	private static void PrintPattern(int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(j<=i)
					System.out.print("11");
			}
			System.out.println();
		}
	}
	public static void getPrimes(){
		for (int i=2;i<=1000000000;i++) {
			//System.out.println(IsPrime(i));
			
			if (i%2!=0){ 
				//if not, then just check the odds
				int count = 0;
				for(int j=3;j*j<=i;j+=2) {
					if(i%j==0) count++;

				}
				if(count==0) {
					System.out.println(i);
				}
//					try {
//						Thread.sleep(2000);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
				
			}
			
		}

	}
	static int getNumberOfPrimes(int N) {
		int count=0;
		Scanner sc = new Scanner(System.in);
		for (int i=2;i<=1000000000;i++) {
			//System.out.println(IsPrime(i));
			if(IsPrime(i)){ System.out.print(i);}
		}
		return count;
	}
	static boolean IsPrime(int n) {
		//check if n is a multiple of 2
		if (n%2==0) return false;
		//if not, then just check the odds
		for(int i=3;i*i<=n;i+=2) {
			if(n%i==0)
				return false;
		}
		return true;
	}

	private static void deleterepcontchars(String input){

		input ="abccbaad";boolean flag = false;
		for(int i=0;i<input.length()-1;i++){
			int temp = i+1;
			if(input.charAt(i)==input.charAt(temp)){
				flag = true;
			}
			while(flag){				
				if(input.charAt(i)!=input.charAt(temp)){
					flag = false;
					input = input.substring(0,i-1)+input.substring(temp,input.length());
					System.out.println(input);
				}
				temp++;
			}
			//
		}
		System.out.println(input);
	}

	private static void firstNonrepChar(String input){
		List l = new ArrayList<Character>();	
		for(int i= 0 ;i<input.length();i++){
			if(l.contains(input.charAt(i))){

			}
		}
	}

	private static void NofPlaindromes() {
		// TODO Auto-generated method stub
		String input = "1xyzyx323bb";
		int count = 0;
		for(int i = 0;i<input.length();i++){			
			for(int j=i+1;j<input.length();j++){
				if(IsPalindrome(input.substring(i,j+1))){
					System.out.println(input.substring(i,j+1));
					count++;
				}
			}			
		}
		System.out.println(count);

	}

	public static boolean IsPalindrome(String in){
		StringBuilder sb = new StringBuilder(in);
		//System.out.println(in+" input: "+sb.reverse().toString().equals(in));
		return sb.reverse().toString().equals(in);
	}

	private static void replace20withspace() {
		// TODO Auto-generated method stub
		String input = "hi%20was%20up%20";
		char[] temp = input.toCharArray();
		char[] out = new char[temp.length];
		for(int i=0,j=0;i<input.length();i++,j++){
			//System.out.println(input.length()-i);
			if(input.length()-i>=3){
				if(temp[i]=='%' && temp[i+1]=='2' && temp[i+2]=='0'){
					out[j] = ' ';
					i=i+2;
				}else{
					out[j]=temp[i];
				}
			}else{
				out[j]=temp[i];
			}
		}

		System.out.println(String.valueOf(out));
	}

	private static void wildcards() {
		// TODO Auto-generated method stub
		String input = "0?1??";
		Set<String> lst = new TreeSet<String>();
		lst = ReplaceWildchars(input);
		Iterator<String> iterator = lst.iterator();
		while(iterator.hasNext()) {
			String setElement = iterator.next();
			if(setElement.contains("?")) {
				iterator.remove();
			}else{
				System.out.println(setElement);

			}
		}

	}

	private static Set<String> ReplaceWildchars(String input) {	
		boolean flag = true;
		for(int i=0;i<input.length();i++){
			if(input.charAt(i)=='?'){

				//System.out.println("2");
				input = input.substring(0,i)+'0'+input.substring(i+1,input.length());
				lst.add(input);
				ReplaceWildchars(input);

				input = input.substring(0,i)+'1'+input.substring(i+1,input.length());
				lst.add(input);
				ReplaceWildchars(input);


			}
		}
		return lst;

	}




}
