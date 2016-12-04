package com.Strings;

public class DistinctSubSequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num  = countSubSequneces("rabbbit", "rabbit");
	}

	private static int countSubSequneces(String S, String T) {
		
			int[][] table = new int[S.length() + 1][T.length() + 1];
		 
			for (int i = 0; i < S.length(); i++)
				table[i][0] = 1;
		 
			for (int i = 1; i <= S.length(); i++) {
				for (int j = 1; j <= T.length(); j++) {
					if (S.charAt(i - 1) == T.charAt(j - 1)) {
						table[i][j] += table[i - 1][j] + table[i - 1][j - 1];
					} else {
						table[i][j] += table[i - 1][j];
					}
				}
			}
			for (int i = 0; i <= S.length(); i++) {
				for (int j = 0; j <= T.length(); j++) {
					System.out.print(table[i][j]+" ");
				}
				System.out.println();
			}
			
		 
			return table[S.length()][T.length()];
		}
	

}
