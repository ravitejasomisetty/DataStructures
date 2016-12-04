package com.Strings;

public class LongestPlaindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pal= "ahuliriljureddydder";
		String lon = "";
		for(int i=0;i<pal.length();i++){
			String res = IsPal(pal,i,i);
			//System.out.println(res);
			if(res.length()>lon.length()){
				lon = res;
			}
		}
		
		System.out.println(lon);
	}
	public static String IsPal(String pal,int start, int end){
		
		while(start>=0 && end<pal.length() && pal.charAt(start)==pal.charAt(end)){
			start--;end++;
		}
		//System.out.println(pal.substring(start+1,end));
		return pal.substring(start+1,end);
	}

}
