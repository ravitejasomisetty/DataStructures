package com.Trie;

import java.util.Arrays;


public class PrintAnagramsTogether {

	public static void main(String[] args) {
		String wordArr[] = {"cat", "dog", "tac", "god", "act", "gdo"};
		print(wordArr);
	}

	private static void print(String[] wordArr) {
		// TODO Auto-generated method stub
		String dup[] = new String[wordArr.length];
		for(int i=0 ; i<wordArr.length;i++){
			char temp[] = wordArr[i].toCharArray();
			Arrays.sort(temp);
			dup[i] =new String(temp);
			//System.out.print(dup[i]+ " ");
		}
		Trie root = new Trie();
		for(int i=0;i<dup.length;i++){
			root.insert(dup[i], i);
		}
		root.print(wordArr);
		
		//System.out.println((char) 97);
		//System.out.println((char) 122);
		
//		for(int i=97;i<123;i++){
//			root.print((char)i, wordArr);
//		}
	}

}
