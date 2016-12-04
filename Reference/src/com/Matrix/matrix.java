package com.Matrix;

import java.util.ArrayList;
import java.util.List;

public class matrix {
	static int Max_row ; 
	static int Max_col ; 
	static int count ;
	static int[] path = new int[20];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[][]{
				{1,0,3},
				{5,6,7},
				{9,10,11}
		};
		Max_row = 4;
		Max_col = 4;
		//printSpiral(arr);
		//replacebyzeros(arr);
		shift90(arr);
		//path = new int[20];
		//System.out.println(Max_col);
		//numberofPathstoEnd(arr,0,0);
		//DPnumberofPathstoEnd(arr);
		//PathstoEnd(arr,0,0,0);
		//System.out.println(count);
	}
	private static void printSpiral(int[][] arr) {
		// TODO Auto-generated method stub
		Max_row--;Max_col--;
		int k = 0,l = 0;
		while(k<=Max_row && l<=Max_col){
			//first row
			for(int i =l;i<=Max_col;++i){
				System.out.print(arr[k][i]+" ");
			}
			k++;
			//right column
			for(int j=k;j<=Max_row;++j){
				System.out.print(arr[j][Max_col]+" ");
			}
			Max_col--;
			//bottom
			for(int i =Max_col;i>l;--i){
				System.out.print(arr[Max_row][i]+" ");
			}
			Max_row--;
			//left column
			for(int j=Max_row;j>k;--j){
				System.out.print(arr[j][l]+" ");
			}
			l++;
		}
		
	}
	private static void  shift90(int[][] arr){
		int n = arr.length;
		for(int i=0;i<arr.length-1;i++){
			for(int j=i;j<arr.length-1;j++){
				int temp = arr[i][j];
				arr[i][j] = arr[n-1-j][i];
				arr[n-1-j][i]= arr[n-1-i][n-1-j];
				arr[n-1-i][n-1-j] = arr[j][n-1-i];
				arr[j][n-1-i]= temp;

			}
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				System.out.print(arr[i][j]+" ");

			}
			System.out.println();
		}


	}

	private static void replacebyzeros(int[][] arr){
		List row = new ArrayList();
		List column = new ArrayList();
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i][j]==0){
					row.add(i);column.add(j);
				}
			}
			//System.out.println();
		}
		makezero(arr,row,column);
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				System.out.print(arr[i][j]+" ");

			}
			System.out.println();
		}
	}

	private static void makezero(int[][] arr,List<Integer> row, List<Integer> column) {
		// TODO Auto-generated method stub
		for(int r: row){
			for(int i=0;i<arr[r].length;i++){
				arr[r][i]=0;
			}
		}
		for(int c :column){
			for(int i=0;i<arr.length;i++){
				arr[i][c]=0;
			}
		}

	}
	private static void DPnumberofPathstoEnd(int[][] arr) {
		// TODO Auto-generated method stub
		int temp[][] = new int[Max_row][Max_col];
		for(int i=0;i<Max_row;i++)
		{
			for(int j=0;j<Max_col;j++){
				if(i==0||j==0){
					temp[i][j]=1;
				}else{
					temp[i][j] = temp[i-1][j]+temp[i][j-1];
				}				
			}
		}
		System.out.println(temp[Max_row-1][Max_col-1]);

	}
	private static void numberofPathstoEnd(int[][] arr, int i, int j) {
		// TODO Auto-generated method stub
		if(i==Max_row-1 && j==Max_col-1){
			count++;
		}
		if(i<Max_row)
			numberofPathstoEnd(arr,i+1,j);
		if(j<Max_col)
			numberofPathstoEnd(arr,i,j+1);
	}
	private static void PathstoEnd(int[][] arr, int i, int j,int index) {
		// TODO Auto-generated method stub
		//System.out.println(arr[i][j]+ " Path: "+path[index]);

		if(i==Max_row-1 && j==Max_col-1){
			System.out.println(path[index]);
			System.out.println("came");
		}else if(i>=Max_row || j>=Max_col)
			System.out.println();
		else {
			System.out.println(i+" J:"+j);
			path[index]=arr[i][j];
			System.out.println(path);
			if(i<Max_row)
				PathstoEnd(arr,i+1,j,index+1);
			if(j<Max_col)
				PathstoEnd(arr,i,j+1,index+1);
		}
	}	


	//dp and normal solutions for number of paths, print paths
	// find any element in sorted matrix


}
