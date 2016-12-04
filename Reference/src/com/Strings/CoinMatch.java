package com.Strings;

import java.util.ArrayList;
import java.util.HashSet;

public class CoinMatch {
	static HashSet<Integer> result = new HashSet<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(6);
		list.add(5);
		list.add(8);
		int res =11;

		int count = MinCoins(res,list);
		System.out.println("coin: "+count);

	}

	private static Integer MinCoins(int total, ArrayList<Integer> coins) {
		int temp[][] = new int[coins.size()+1][total+1];

		for(int i= 0;i<=coins.size();i++)
			temp[i][0] = 0;
		
		for(int i= 1;i<=coins.size();i++){
			for(int j= 1 ;j<=total;j++){
				if(j<coins.get(i-1)){
					temp[i][j] = temp[i-1][j];
				}else{
					temp[i][j] = Math.min(temp[i-1][j], temp[i][j-coins.get(i-1)]+1);
				}

			}
		}
		return temp[coins.size()][total];
	}


}
