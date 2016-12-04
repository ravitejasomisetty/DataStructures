package com.Matrix;

public class FindIslands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] =  {{'O', 'O', 'O'},
                {'X', 'X', 'O'},
                {'X', 'X', 'O'},
                {'O', 'O', 'X'},
                {'O', 'O', 'X'},
                {'X', 'X', 'O'}
              };
		find(mat);
	}

	private static void find(int[][] mat) {
		int count = 0 ;
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[0].length;j++){
				if(mat[i][j]=='X'){
					if((i==0 || mat[i-1][j]=='O') && (j==0 || mat[i][j-1]=='O')){
						count++;
					}
				}
			}
		}
		System.out.println(count);
		
	}

}
