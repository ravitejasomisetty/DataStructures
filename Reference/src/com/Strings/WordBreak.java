package com.Strings;

import java.util.*;

public class WordBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		set.add("leet");set.add("code");
		//System.out.println(wordBreak("leetcode",set));
		String s = "Ravitejathutari";
		System.out.println(s.substring(0,4));
		System.out.println(s);
	}
	
	public static boolean wordBreak(String s, Set<String> dict) {
        boolean[] t = new boolean[s.length()+1];
        t[0] = true; //set first to be true, why?
        //Because we need initial state
 
        for(int i=0; i<s.length(); i++){
            //should continue from match position
            if(!t[i]) 
                continue;
            
            for(String a: dict){
                int len = a.length();
                int end = i + len;
                if(end > s.length())
                    continue;
                System.out.println("dict: "+a+ " i: "+i+ " end: "+end + " slen: "+s.length()+ " t[i]: "+t[i] + " t[end]: "+t[end]+ " substring: "+s.substring(i, end));
                if(t[end]) continue;
                System.out.println("t[end]: "+t[end]);
                if(s.substring(i, end).equals(a)){
                    t[end] = true;
                }
            }
        }
 
        return t[s.length()];
    }

}
