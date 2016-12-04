package com.Strings;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LongestpalsubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tmp = "liril";
		//System.out.println(tmp.substring(0,1));
		//System.out.println(tmp.substring(1,0));
		//System.out.println(longestPalindrome("aabaa"));
		NumberPalindrome("aabaa");
	}
	public static int NumberPalindrome(String s) {
		if (s.isEmpty()) {
			return 0;
		}	 
		if (s.length() == 1) {
			return 1;
		}	    
		String longest = s.substring(0, 1);
        Set<String> set = new HashSet<String>();
		for (int i = 0; i < s.length(); i++) {
			set = pal(set,s, i, i);			
			set = pal(set,s, i, i + 1);			
		}
	 System.out.println(set.size());
		return set.size();
	}
	private static Set<String> pal(Set<String> set, String s,  int begin, int end) {
		while (begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
			set.add(s.substring(begin,end+1));
			begin--;
			end++;
		}
		return set;
	}
	public static String longestPalindrome(String s) {
		if (s.isEmpty()) {
			return ""+0;
		}
	 
		if (s.length() == 1) {
			return ""+1;
		}
	    
		String longest = s.substring(0, 1);
        int count =0;
		for (int i = 0; i < s.length(); i++) {
			String tmp = helper(s, i, i);
			System.out.println(" : "+tmp);
			if (tmp.length() >= longest.length()) {
				longest = tmp; count++;
			}
			tmp = helper(s, i, i + 1);
			System.out.println(" : "+tmp);
			if (tmp.length() >= longest.length()) {
				longest = tmp;count++;
			}
		}
	 
	 System.out.println(count);
		return longest;
	}
	 
	// Given a center, either one letter or two letter, 
	// Find longest palindrome
	public static String helper(String s, int begin, int end) {
		while (begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
			begin--;
			end++;
		}
		return s.substring(begin + 1, end);
	}
}
