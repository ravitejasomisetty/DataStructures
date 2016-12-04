package com.Arrays;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ClosestNumbers {

	public static void main(String[] args) throws IOException {
		System.out.println(closest(12, "-20 -3916237 -357920 -3620601 7374819 -7330761 30 6246457 -6461594 266854 -520 -470 "));
		System.out.println(closestNumbers(12, "-20 -3916237 -357920 -3620601 7374819 -7330761 30 6246457 -6461594 266854 -520 -470 "));
		
	}
	
	static String closestNumbers(int len, String s ){
		
		ArrayList<Integer> list = new ArrayList<Integer>(len);
		for(String inp : s.split(" ")){
			list.add(Integer.parseInt(inp));
		}
		Collections.sort(list);
		StringBuffer result = new StringBuffer();
		int minValue=Integer.MAX_VALUE;
		for(int i=0;i < list.size()-1;++i)
		{
			int diff = Math.abs(list.get(i) - list.get(i+1));
			if(diff < minValue){
				minValue=diff;
				result = new StringBuffer();
				result.append(list.get(i));
				result.append(" ");
				result.append(list.get(i+1));
			}else if(diff == minValue){
				result.append(" ");
				result.append(list.get(i));
				result.append(" ");
				result.append(list.get(i+1));
			}
		}
		
		
		return result.toString();
	}
	
	static String closest(int len, String s ){
		int[] array=new int[len];
		String[] temp = s.split(" ");
		for(int i = 0; i < len; i++){
			array[i] = Integer.parseInt(temp[i]);
		}
		Arrays.sort(array);
		StringBuffer result = new StringBuffer();
		int minValue=Integer.MAX_VALUE;
		for(int i=0;i < array.length-1;++i)
		{
			int tempDiff=Math.abs(array[i]-array[i+1]);
			if(tempDiff < minValue){
				minValue=tempDiff;
				result = new StringBuffer();
				result.append(array[i]);
				result.append(" ");
				result.append(array[i+1]);
			}else if(tempDiff == minValue){
				result.append(" ");
				result.append(array[i]);
				result.append(" ");
				result.append(array[i+1]);
			}
		}
		return result.toString();

	}

}
