package com.Strings;

import sun.security.util.Length;

public class CheckGrammerRules {

	/**
	 *1. Sentence must start with a Uppercase character (e.g. Noun/ I/ We/ He etc.)
	 *2. Then lowercase character follows.
	 *3. There must be spaces between words.
	 *4. Then the sentence must end with a full stop(.) after a word.
	 *5. Two continuous spaces are not allowed.
	 *6. Two continuous upper case characters are not allowed.
	 *7. However the sentence can end after an upper case character.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input  =  "I love Geeksquiz and Geeksforgeeks.";
		boolean flag  = check(input); 
		System.out.println(flag);
	}

	private static boolean check(String input) {
		// TODO Auto-generated method stub
	
		if(!Character.isUpperCase(input.charAt(0)) || input.charAt(input.length()-1)!='.'){
			return false;
		}
		int curState =0,prevState = 0,index =1;
		
		for(;index<input.length();index++){
			
			if(input.charAt(index)>='A' && input.charAt(index)<='Z'){
				curState = 0;
			}else if(input.charAt(index) == ' '){
				curState = 1;
			}else if (input.charAt(index)>='a' && input.charAt(index)<='z'){
				curState = 2;
			}else if(input.charAt(index)=='.'){
				curState=3;
			}
			if(curState == prevState && curState!=2){
				return false;
			}
			if(prevState==2 && curState==0){
				return false;
			}
			if(curState==3 && prevState!=1){
				return true;
			}
			prevState = curState;
		}
		
		
		return true;
	}

}
