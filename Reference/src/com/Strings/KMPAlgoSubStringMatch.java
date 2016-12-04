package com.Strings;

public class KMPAlgoSubStringMatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input = "ABABACBCABABABCABABABAC";
		String target = "ABABAC";
		check(input,target);

	}

	private static void check(String input, String target) {
		// TODO Auto-generated method stub
		int pattern[] = suffixArray(target);
		char a[] = input.toCharArray();
		char b[] = target.toCharArray();
		int i = 0 ,j=0;
		while(i<input.length()){
			if(a[i]==b[j]){
				if(j == target.length()-1){
					System.out.println("index : "+(i-j)); i++; j =0;
				}else{
					i++;j++;
				}
				
			}else if(j>0){
				j = pattern[j-1];
			}else{
				i++;
			}
		}
 	}

	private static int[] suffixArray(String target) {
		// TODO Auto-generated method stub
		int j = 0, i =1;
		int[] tar = new int[target.length()];
		while(i<target.length()){
			if(target.charAt(i)== target.charAt(j)){								
				j++;
				tar[i] = j;
				i++;
			}else if(j>0){
				j = tar[j-1];
			}else{
				tar[i]=0;
				i++;
			}
		}
		for(int k : tar){
			System.out.print(k);
		}
		return tar;
	}

}
