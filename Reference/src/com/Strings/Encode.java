package com.Strings;

public class Encode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "wwwwaaadexxxxxx";
		int i = 5 ;
		System.out.println(String.valueOf(i).toCharArray());
		encode (input);
		encodeInplace(input);
	}

	private static void encodeInplace(String input) {
		// TODO Auto-generated method stub
		int index = 1;
		char[] arr = input.toCharArray();
		char start = arr[0];
		int startCount = 0;
		for(int i=1;i<arr.length;i++){
			if(start == arr[i]){
				index++;
				//start = arr[i];				
			}else{
				arr[startCount++] = start;
				arr[startCount++] = String.valueOf(index).toCharArray()[0]; 
				index  = 1; 
			}
			start = arr[i];
		}
		
		arr[startCount++] = start;
		arr[startCount++] = String.valueOf(index).toCharArray()[0];
		
		for(int i =startCount;i<input.length();i++){
			arr[i] = ' '; 
		}
		for(char i : arr){
			System.out.print(i);
		}
	}

	private static void encode(String input) {
		int index = 1;
		int start = input.charAt(0);
		StringBuffer sb = new StringBuffer();
		for(int i=1;i<input.length();i++){
			if(start == input.charAt(i)){
				index++;
				start = input.charAt(i);
				
			}else{
				
				sb.append(Character.toString((char)start));sb.append(index);
				index  = 1; start = input.charAt(i);
			}
		}
		sb.append(Character.toString((char)start));sb.append(index);
		System.out.println(sb.toString());
		
	}

}
