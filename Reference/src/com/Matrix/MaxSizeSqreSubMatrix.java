package com.Matrix;

public class MaxSizeSqreSubMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int M[][] =  {{0, 1, 1, 0, 1}, 
                 {1, 1, 0, 1, 0}, 
                 {0, 1, 1, 1, 0},
                 {1, 1, 1, 1, 0},
                 {1, 1, 1, 1, 1},
                 {0, 0, 0, 0, 0}};
		 findSquare(M);
	}

	private static void findSquare(int[][] m) {
		int aux[][] = new int[m.length][m[0].length];
		
		for(int i=0;i<m[0].length;i++){
			aux[0][i] = m[0][i];
		}
		for(int i=0;i<m.length;i++){
			aux[i][0] = m[i][0];
		}
		
		for(int i =1;i<m.length;i++){
			for(int j=1;j<m[0].length;j++){
				if(m[i][j]==1){
					aux[i][j] = Math.min(aux[i-1][j-1],Math.min(aux[i-1][j],aux[i][j-1]) )+1;
				}else{
					aux[i][j] = 0;
				}
			}
		}
		Print.print(aux);
		int max = 0,max_i=0,max_j=0;
		for(int i =0;i<m.length;i++){
			for(int j=0;j<m[0].length;j++){
				if(aux[i][j]>max){
					max =aux[i][j];
					max_i = i;max_j = j;
				}
			}
		}
		for(int i=max_i;i>max_i-max;i--){
			for(int j=max_j;j>max_j-max;j--){
				System.out.print(m[i][j]);
			}
			System.out.println();
		}
	}

}
