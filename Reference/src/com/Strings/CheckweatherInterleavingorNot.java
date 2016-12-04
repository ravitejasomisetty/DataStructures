package com.Strings;

public class CheckweatherInterleavingorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s2 = "aab";
		String s1 = "axy";
		String s3  = "aaxaby";
		boolean flag = check(s1.toCharArray(),s2.toCharArray(),s3.toCharArray());
	}

	private static boolean check(char[] s1, char[] s2, char[] s3) {
		// TODO Auto-generated method stub
		boolean[][] res = new boolean[s1.length+1][s2.length+1];
		for(int i=0;i<s1.length+1;++i){
			for(int j=0;j<s2.length+1;++j){
				//System.out.print(i+ " "+ j);
//				if(i>1 ){
//					System.out.print(s2[j-1]+" ");
//					System.out.print(s3[i+j-1]);
//					System.out.println();
//				}
				
				if(i==0 && j==0){
					res[i][j] = true;
				}else if(i==0 && s2[j-1] == s3[i+j-1]){ ;
					res[i][j] = res[i][j-1];
				}else if(j==0 && s1[i-1] == s3[i+j-1]){ ;
					res[i][j] = res[i-1][j];
				}else if(i>=1 && j>=1 && s1[i-1]==s3[i+j-1] && s2[j-1]!=s3[i+j-1]){
					res[i][j] = res[i-1][j];
				}else if(i>=1 && j>=1 && s1[i-1]!=s3[i+j-1] && s2[j-1]==s3[i+j-1]){
					res[i][j] = res[i][j-1];
				}else if(i>=1 && j>=1 && s1[i-1]==s3[i+j-1] && s2[j-1]==s3[i+j-1]){
					res[i][j] = (res[i][j-1]|| res[i-1][j]);
				}
				//System.out.println(res[i][j]);
			}
		}
		System.out.println(res[s1.length-1][s2.length-1]);
		return false;
	}

}
