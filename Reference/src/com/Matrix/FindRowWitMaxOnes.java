package com.Matrix;

public class FindRowWitMaxOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = { {0, 0, 0, 1},
		        {0, 1, 1, 1},
		        {1, 1, 1, 1},
		        {0, 0, 0, 0}
		    };
		 find(mat);
	}

	private static void find(int[][] mat) {
		int index = -1;
		for(int i=0;i<mat[0].length;i++){
			if(mat[0][i]==1){
				index = i-1;
			}
		}
		if(index==-1) index = mat[0].length-1;
		int max = 0;
		for(int i=1 ; i<mat.length;i++){
			while(index >=0 && mat[i][index]==1  ){
				index--;
				max = i;
			}
		}
		System.out.println(max);
	}

}
