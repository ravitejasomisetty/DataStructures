package com.Matrix;

public class SearchRowColumnSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = { {10, 20, 30, 40},
				{15, 25, 35, 45},
				{27, 29, 37, 48},
				{32, 33, 39, 50}};
		int ele = 29;
		int i=0,j=mat.length-1;
		while(i<mat.length && j>=0){
			if(mat[i][j]==ele){
				break;
			}else if(mat[i][j]<ele){
				i++;
			}else j--;
		}
		System.out.println(mat[i][j]);
	}

}
