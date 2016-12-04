package com.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;



public class SortElementsByFrequency {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,5,2,8,5,6,8,8};
		Map<Integer,Integer> map  = new HashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++){
			if(map.get(a[i])== null){
				map.put(a[i],1);
			}else{
				map.put(a[i], map.get(a[i])+1);
			}
		}
		  List<Entry<Integer, Integer>> list= new ArrayList<Entry<Integer, Integer>>(map.entrySet());
		  Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			  
              public int compare(Entry<Integer, Integer> o1,
                      Entry<Integer, Integer> o2) {
                  return o2.getValue().compareTo(o1.getValue());
              }
          });
		  for(Entry<Integer, Integer> x : list){
			  System.out.print(x.getKey()+ " ");
			  System.out.print(x.getValue());
			  System.out.println();
		  }
		
	}

}
