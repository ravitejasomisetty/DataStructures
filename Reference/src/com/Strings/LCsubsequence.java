package com.Strings;

public class LCsubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestCommonSubSequence("ABCDGH", "AEDFHR");
	}
	public static void LongestCommonSubSequence(String first, String second) {
		if (first == null || second == null || first.length() == 0 || second.length() == 0) {

		}
		int maxi=0,maxj=0;
		int maxLen = 1;
		int fl = first.length();
		int sl = second.length();
		int[][] table = new int[fl+1][sl+1];
		StringBuilder sb = new StringBuilder(second.charAt(0));
		int lastSubsBegin = 0;

		for(int s=0; s <= sl; s++)
			table[0][s] = 0;
		for(int f=0; f <= fl; f++)
			table[f][0] = 0;

		for (int i = 1; i <= fl; i++) {
			for (int j = 1; j <= sl; j++) {
				if (first.charAt(i-1) == second.charAt(j-1)) {					
						table[i][j] = table[i - 1][j - 1] + 1;								
				}else{
					table[i][j] = max(table[i-1][j],table[i][j-1]);
				}
			}
		}
		maxLen = table[fl][sl];		
		//System.out.println(maxLen+ " : "+sb.toString());
		char[] ch = new char[maxLen];
		for(int i= fl,j=sl;i!=0 && j!=0;){
			if(table[i][j]==table[i-1][j]){
				i--;
			}else if(table[i][j]==table[i][j-1]){
				j--;
			}else{
				System.out.println(first.charAt(i-1));
				sb.append(first.charAt(i-1));
				i--;j--;
			}
		}
		System.out.println(maxLen+ " : "+sb.toString());
	}
	static int max(int a, int b)
	{
		return (a > b)? a : b;
	}
}
