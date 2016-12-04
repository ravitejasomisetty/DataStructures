package com.Matrix;

public class Print {

	
	public static void print(int[][] mat){
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[0].length;j++){
				System.out.print(mat[i][j]+ " ");
			}
			System.out.println();
		}
	}
	public static void print(char[][] mat){
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[0].length;j++){
				System.out.print(mat[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
