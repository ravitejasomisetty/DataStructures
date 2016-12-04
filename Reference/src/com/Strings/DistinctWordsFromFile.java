package com.Strings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class DistinctWordsFromFile {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\tejachilled\\Desktop\\accounts.txt"));
		String line  = "";
		TreeSet<String> set  = new TreeSet<String>();
		while((line = br.readLine())!=null){
			String[] acn = line.split("\\t");
			System.out.println(acn[0]+ " "+acn[1]);
			if(acn[1].equals("active")){
				set.add(acn[0]);
			}
		}
		System.out.println(set.size());
	}

}
