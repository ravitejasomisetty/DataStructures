package com.Strings;

public class Permutations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getPerms("","abcd");
		System.out.println(" ============ ");
		getPermsWithRepetition("","abc");
	}

	private static void getPermsWithRepetition(String prefix, String input) {
		// TODO Auto-generated method stub
	//System.out.println("input : "+input);
		if(prefix.length()  == input.length()){
			System.out.println(prefix); return;
		}
		
			for(int i = 0 ;i<input.length();i++){
				getPermsWithRepetition(prefix+input.charAt(i), input);
			}
		
		
	}

	private static void getPerms(String prefix, String input) {
		// TODO Auto-generated method stub
		if(input.length() == 0 ) System.out.println(prefix);
		else{
			for(int i = 0 ;i<input.length();i++){
				getPerms(prefix+input.charAt(i), input.substring(0,i)+input.substring(i+1,input.length()));
			}
		}
	}

}
