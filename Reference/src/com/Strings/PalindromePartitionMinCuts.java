package com.Strings;

public class PalindromePartitionMinCuts {

	public static void main(String[] args) {
		String input = "ABCCDCCLMLCCD";
		findMinCuts(input);

	}

	private static void findMinCuts(String input) {
		boolean[][] p= new boolean[input.length()][input.length()];
		int[][] res = new int[input.length()][input.length()];

		for(int i=0;i<input.length();i++){
			p[i][i] = true;
		}
		for(int l=2;l<=input.length();l++){
			for(int i=0;i<input.length()-l+1;i++){
				int j = i+l-1;
				if(l==2){
					p[i][j] = (input.charAt(i)== input.charAt(j));
				}
				else{
					p[i][j] = (input.charAt(i)== input.charAt(j) && p[i+1][j-1]);
				}
				if(p[i][j]){
					res[i][j] = 0;
				}else{
					res[i][j] = Integer.MAX_VALUE;
					int r = 0;
					for(int k = i ; k <j;k++){
						r = res[i][k]+res[k+1][j]+1;
						if(r<res[i][j]){
							res[i][j] = r;
						}
					}
				}
			}
			

		}
		for(int i = 0 ;i<input.length();i++){
		for(int j = 0 ;j<input.length();j++){
			System.out.print(res[i][j]);
		}System.out.println();
		}
		System.out.println(res[0][input.length()-1]);
	}

}

