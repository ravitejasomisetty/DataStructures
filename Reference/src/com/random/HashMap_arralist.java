package com.random;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class HashMap_arralist {

	static int SIZE = 100;
	static List  keys= new ArrayList();
	static	List values = new ArrayList();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap_arralist map = new HashMap_arralist();
		map.put("1","2");
		System.out.println(map.get("1"));
		
		TreeSet s = new TreeSet<hash>();
		hash h1 = new hash();
		s.add(h1);
	}

	private Object get(String i) {
		// TODO Auto-generated method stub
		//int add = i.hashCode()%SIZE;	
		if(!keys.contains(i)){
			return null;
		}
		return values.get(keys.indexOf(i));
	}

	private void put(String i, String j) {
		if(keys.contains(i)){
			values.set(keys.indexOf(i), j);
		}else{
			keys.add(i);
			values.add(j);
		}
	}
	
}

class hash{
	
	
}
