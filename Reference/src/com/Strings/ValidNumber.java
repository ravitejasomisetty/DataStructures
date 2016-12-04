package com.Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "9.10   ";
		String p1 = " *(([0-9]?)|((-)?[1-9]+([0-9])*((e|\\.)[0-9]+)?)) *";
		String p2 = "[1-9]+([0-9])";
		Pattern p = Pattern.compile(p1);
		Matcher m  = p.matcher(s);
		System.out.println(m.matches());
		StringBuffer sb = new StringBuffer();
		sb.insert(0, 1);
		sb.insert(0, 2);
		System.out.println(sb.toString());
	}

}
