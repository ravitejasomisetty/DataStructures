package com.Matrix;

import java.util.Arrays;

public class LongestPathWithOneDiff {

	public static void main(String[] args) {
		int  mat[][] = {{1, 2, 9},
				{5, 3, 8},
				{4, 6, 7}};
		findLongestPath(mat);
	}

	private static void findLongestPath(int[][] mat) {
		int [][] dp = new int[mat.length][mat[0].length];
		int res = 0;

		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[0].length;j++){
				dp[i][j]=-1;
			}
		}

		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[0].length;j++){
				if(dp[i][j]==-1) findPath(i,j,mat,dp);
				
				if(res < dp[i][j]){
					res = Math.max(res, dp[i][j]);
					System.out.println(dp[i][j]+" ->");
				}
			}
		}
		System.out.println(res);

	}

	private static int findPath(int i, int j, int[][] mat, int[][] dp) {
		if(i<0 || i>mat.length-1 || j < 0 || j>mat[0].length-1) return 0;
		if(dp[i][j]!=-1) return dp[i][j];
		//

		if( j+1 < mat[0].length && mat[i][j]+1 == mat[i][j+1]){
			return dp[i][j]= 1+ findPath(i,j+1,mat,dp);
		}
		
		if(j-1>=0 && mat[i][j]+1 == mat[i][j-1]){
			return dp[i][j]= 1+ findPath(i,j-1,mat,dp);
		}
		
		if(i+1 <mat.length && mat[i][j]+1 == mat[i+1][j]){
			return dp[i][j]= 1+ findPath(i+1,j,mat,dp);
		}

		if(i-1>=0 && mat[i][j]+1 == mat[i-1][j]){
			return dp[i][j]= 1+ findPath(i-1,j,mat,dp);
		}
		


		return dp[i][j]=1;
	}

}
