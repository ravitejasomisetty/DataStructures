package com.random;

import java.io.*;
import java.util.*;
public class Solution {
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			if (scanner.hasNextInt()) {
				list.add(scanner.nextInt());
			}
		}
		System.out.println();
	}
}
