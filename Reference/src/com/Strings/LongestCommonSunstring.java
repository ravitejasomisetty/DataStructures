package com.Strings;

public class LongestCommonSunstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "OldSite:GeeksforGeeks.org";
		String s2  = "NewSite:GeeksQuiz.com";
		findLCS(s1.toCharArray(),s2.toCharArray());
	}

	private static void findLCS(char[] s1, char[] s2) {
		// TODO Auto-generated method stub
		int[][] res  = new int[s1.length+1][s2.length+1];
		int max = 0,i1=0;
		for(int i=0;i<s1.length+1;i++){
			for(int j=0;j<s2.length+1;j++){
				if(i==0||j==0){
					res[i][j]=0;
				}else{
					if(s1[i-1]==s2[j-1]){
						res[i][j]= 1+ res[i-1][j-1];
						if(res[i][j]>max){
							max = res[i][j];
							i1=i;
						}
					}
				}
			}
		}
		//System.out.println(i1);
		System.out.println(max);
		System.out.println(new String(s1).substring(i1-max,i1));
	}

}
