package com.binarytree;

import java.util.TreeMap;

public class VerticalSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTree root = new BinaryTree().getData();
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		
		map = findVerticalSum(root,map,0);
		System.out.println(map);
	}

	private static TreeMap<Integer, Integer> findVerticalSum(BinaryTree root,
			TreeMap<Integer, Integer> map,int level) {
		// TODO Auto-generated method stub
		if(root == null) return map;		
		findVerticalSum(root.left,map,level-1);
		int val = (map.get(level)== null?0:map.get(level));
		val += root.data;
		map.put(level,val);
		findVerticalSum(root.right,map,level+1);
		return map;
		
		
	}

}
