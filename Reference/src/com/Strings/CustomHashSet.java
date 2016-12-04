package com.Strings;

import java.util.HashMap;

public class CustomHashSet {
	private static HashMap<Integer,Object> map ;
	private static final Object PRESENT = new Object();
	
	CustomHashSet(){
		map= new HashMap<Integer, Object>();
	}
	public boolean add(int i){
		return map.put(i,PRESENT )==null;
	}
	public boolean remove(int i){
		return map.remove(i) == null;
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
