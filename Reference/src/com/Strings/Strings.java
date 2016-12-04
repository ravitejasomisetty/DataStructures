package com.Strings;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Strings {
	static Set<String> lst = new TreeSet<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//wildcards();
		//replace20withspace();
		//NofPlaindromes();
		String s = "abcdefghijklmnop";
		Strings sts = new Strings();
		//sts.permutations(s);
		
		String s1 = null,s2 = "a";
		System.out.println(s1.concat(s2));
		
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

	public void permutations(String s)
	{
		orderedPermutations("",s);
	}

	public void orderedPermutations(String prefix, String str)
	{
		int length = str.length();
		if(str.length()==0){
			System.out.println(prefix);
		}
		else
		{
			for(int i=0; i<length; i++)
				orderedPermutations(prefix+str.charAt(i), str.substring(0,i)+str.substring(i+1, length));
		}
	}


}
