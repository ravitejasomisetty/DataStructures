package com.Strings;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		
		String input = "forgeeksskeegfor";
		findWithSpace(input);
		findWithoutSpace(input);

	}

	private static void findWithoutSpace(String input) {
		int max = 0,index = 0;
		for(int i=1;i<input.length()-1;i++){
			int len = getPal(input,i,i);
			if(len>1 && len>max){
				max = len;
				index = i;
			}
			len = getPal(input,i,i+1);
			if(len >max){
				max = len;
				index = i;
			}			
		}
		System.out.println(max);
		int start = index-max/2,end = start+max;
		System.out.println(input.substring(start+1,end+1));
		
	}

	private static int getPal(String input, int start, int end) {
		while(start<end){
			if(input.charAt(start)==input.charAt(end)){
				start--;end++;
			}else{
				break;
			}
		}
		return end-start-1;
	}

	private static void findWithSpace(String input) {
		// TODO Auto-generated method stub
		boolean[][] pal = new boolean[input.length()][input.length()];
		for(int i=0;i<input.length();i++){
			pal[i][i] = true;
		}
		int max = 0,l=0,index = 0;
		for (l=2;l<input.length();l++){
			for(int i=0;i<input.length()-l+1;i++){
				int j = l+i-1;
				if(l==2){
					pal[i][j] = (input.charAt(i)==input.charAt(j));
				}else{
					pal[i][j] = (input.charAt(i)==input.charAt(j) && pal[i+1][j-1]);
				}
				if(pal[i][j]){
					if(l>max){
						max = l;
						index = i;
					}
				}
			}
		}
		System.out.println(max);
		System.out.println(input.substring(index,index+max));
	}

}
