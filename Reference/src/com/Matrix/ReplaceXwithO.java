package com.Matrix;

public class ReplaceXwithO {

	public static void main(String[] args) {
char mat[][] = {{'X', 'O', 'X', 'O', 'X', 'X'},
                {'X', 'O', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'O', 'X', 'X'},
                {'O', 'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'O', 'X', 'O'},
                {'O', 'O', 'X', 'O', 'O', 'O'},
               };
		replace(mat);
	}

	private static void replace(char[][] mat) {
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[0].length;j++){
				if(mat[i][j]=='O')mat[i][j] = '-';
			}
		}
		char prev = '-';
		char nw = 'O';
		for(int i=0;i<mat.length;i++){
			if(mat[i][0]=='-') fill(i,0,prev,nw,mat);
		}
		for(int i=0;i<mat.length;i++){
			if(mat[i][mat[0].length-1]=='-') fill(i,mat[0].length-1,prev,nw,mat);
		}
		for(int i=0;i<mat[0].length;i++){
			if(mat[0][i]=='-') fill(0,i,prev,nw,mat);
		}
		for(int i=0;i<mat[0].length;i++){
			if(mat[mat.length-1][i]=='-') fill(mat.length-1,i,prev,nw,mat);
		}
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[0].length;j++){
				if(mat[i][j]=='-')mat[i][j] = 'X';
			}
		}
		Print.print(mat);
		
		
	}

	private static void fill(int x, int y, char prev, char nw,char[][] mat) {
		if(x<0 || x >mat.length-1 || y<0 || y>mat[0].length-1) return;
		if(mat[x][y]!= prev) return;
		mat[x][y] = nw;
		fill(x+1,y,prev,nw,mat);
		fill(x-1,y,prev,nw,mat);
		fill(x,y+1,prev,nw,mat);
		fill(x,y-1,prev,nw,mat);
		
	}

}
