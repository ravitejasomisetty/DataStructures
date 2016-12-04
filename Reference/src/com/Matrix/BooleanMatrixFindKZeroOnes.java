package com.Matrix;

public class BooleanMatrixFindKZeroOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = { {1, 1, 0, 0},
				{0, 1, 0, 0},
				{1, 1, 0, 0},
				{1, 1, 1, 0},
		};
		find(mat);
	}

	private static int find(int[][] mat) {
		int i=0,j=0,res = -1;

		while(i< mat.length && j< mat[0].length){
			if(mat[i][j]==1){
				while((i < mat.length )&& ( mat[i][j]==1 || i==j ) ){
					//System.out.println(mat[i][j]);
					i++;
				}
				if(i==mat.length){
					res = j; break;
				}else{
					j++;
				}

			}else{
				if(mat[i][j]==0){
					while((j< mat[0].length )&& (mat[i][j]==0 || i==j) ){
						j++;
					}
					if(j==mat[0].length){
						res = j; break;
					}else{
						i++;
					}
				}
			}
		}
		System.out.println(res);
		if(res == -1) return res;
		
		return res;
		

	}
}
