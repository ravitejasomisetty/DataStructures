package com.Trie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Trie {
	public class TrieNode{

		char ch;
		boolean isEnd;
		 LinkedList<TrieNode> childList;
		 Map<Character,ArrayList<Integer>> map;
		int count;
		public TrieNode(char ch){
			this.ch = ch;
			isEnd = false;
			childList = new LinkedList<TrieNode>();
			count = 0;
			map = new HashMap<Character, ArrayList<Integer>>();
		}
		public  TrieNode subNode(char ch){
			if(childList!=null){
				for(TrieNode child : childList){
					if(child.ch == ch){
						return child;
					}
				}
			}		
			return null;
		}
	}

	 TrieNode root ;
	public  Trie(){
		root = new TrieNode(' ');
	}
	public void insert(String word,int index){
		
		TrieNode current = search(word);
		if(current == null) current = root;
		else{
			ArrayList<Integer> list = root.map.get(word.charAt(0));
			if(list==null)list = new ArrayList<Integer>();
			list.add(index);
			root.map.put(word.charAt(0), list);
		}
		
		for(char ch : word.toCharArray()){
			TrieNode child = current.subNode(ch);
			if(child!=null){
				current = child;
			}else{
				current.childList.add(new TrieNode(ch));
				current = current.subNode(ch);
			}
			current.count++;
		}
		current.isEnd = true;
		ArrayList<Integer> list = root.map.get(word.charAt(0));
		if(list==null)list = new ArrayList<Integer>();
		list.add(index);
		root.map.put(word.charAt(0), list);
	}

	public TrieNode search(String word){
		TrieNode current = root;
		for(char ch : word.toCharArray()){
			if(current.subNode(ch)==null){
				return null;				
			}else 
				current = current.subNode(ch);
		}
		if(current.isEnd==true){
			return current;
		}else return null;
	}

	public  void main(String[] args){
		Trie trie = new Trie();
		trie.insert("cat", 1);
		System.out.println(trie.search("cat").ch);
	}
	public void print(String[] wordArr) {
		// TODO Auto-generated method stub
		TrieNode current = root;
		for(int i=97;i<123;i++){
			System.out.println(current.map.get((char)i));
		}
	
	}

}
