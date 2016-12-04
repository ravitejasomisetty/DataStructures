package com.Matrix;

public class BooleanMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean mat[][] = { {true, false, false, true},
		        {false, false, true, false},
		        {false, false, false, false},
		    };
		setMat(mat);
	}

	private static void setMat(boolean[][] mat) {
		// TODO Auto-generated method stub
		boolean row[] = new boolean[mat.length];
		boolean col[] = new boolean[mat[0].length];
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[0].length;j++){
				if(mat[i][j]==true){
					row[i] = true;
					col[j] = true;
				}
			}
		}
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[0].length;j++){
				if(row[i] == true || col[j] == true){
					mat[i][j] = true;
				}
			}
		}
		
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[0].length;j++){
				System.out.print(mat[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
