package com.Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1= new ArrayList<String>();
		list1.add("ravi");		list1.add("teja");		list1.add("thutari");
		List<String> list2= new ArrayList<String>();
		list1.add("ravi");		list1.add("ento");		list1.add("pichi");
		List<String> list3= new ArrayList<String>();
		list1.add("cool");		list1.add("thutari");

		List<List<String>> email = new ArrayList<List<String>>();
		email.add(list1);email.add(list2);email.add(list3);
		Common(email);
	}
	public static List<String> Common(List<List<String>> email1){

		List<String> res= new ArrayList<String>();
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		Set<String> set ;
		int cou = 0;
		for( List list : email1)
		{
			set = new HashSet<String>();
			List<String> temp = list;
			for(String i: temp){
				if(!set.contains(i)){
					if(map.get(i) !=null){
						map.put(i, map.get(i)+1);
					}else{
						map.put(i, 1);
					}
				}
			}
			cou++;
		}

		int size = email1.size();

		for(String count: map.keySet()){
			if(map.get(count)== size)
			{
				System.out.println(count);
				res.add(count); 
			}
		}

		return res; // << this 
	}
}
