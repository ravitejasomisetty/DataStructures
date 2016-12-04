package com.Strings;

public class LongestCommonSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestCommonSubString("abcghtjacykhtjackasss", "htjackasstwo");
	}

	public static void LongestCommonSubString(String first, String second) {
		if (first == null || second == null || first.length() == 0 || second.length() == 0) {

		}
		int maxi=0,maxj=0;
		int maxLen = 1;
		int fl = first.length();
		int sl = second.length();
		int[][] table = new int[fl+1][sl+1];
		StringBuilder sb = new StringBuilder(second.charAt(0));
		for(int s=0; s <= sl; s++)
			table[0][s] = 0;
		for(int f=0; f <= fl; f++)
			table[f][0] = 0;

		for (int i = 1; i <= fl; i++) {
			for (int j = 1; j <= sl; j++) {
				if (first.charAt(i-1) == second.charAt(j-1)) {
					if (i == 1 || j == 1) {
						table[i][j] = 1;
					}
					else {
						table[i][j] = table[i - 1][j - 1] + 1;
					}
					if (table[i][j] > maxLen) {
						//sb = new StringBuilder(first.charAt(i-1));
						maxLen = table[i][j];
						sb.append(second.charAt(j-1));
					}
				}
			}
		}

		System.out.println(maxLen+ " : "+sb.toString());
	}
}
