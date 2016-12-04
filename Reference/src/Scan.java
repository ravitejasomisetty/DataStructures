
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Scan {

	public static void main(String[] args) throws IOException {
//		System.out.println(args.length);
//		File inFile = new File(args[0]);
//		if(args.length>0){
//			BufferedReader br = new BufferedReader(new FileReader(inFile));
//			int lines  = 0;
//			int words = 0;
//			int chars = 0; 
//			while(br.readLine()!=null){
//				lines++;
//				String tempLine  = br.readLine();
//				System.out.println(tempLine);
//				String[] wordsList = tempLine.replace("\\s+", " ").split(" ");
//				words += wordsList.length;
//				for(String w: wordsList){
//					chars += w.length();
//				}
//			}
//			System.out.println("number of lines: "+lines);
//			System.out.println("number of words: "+words);
//			System.out.println("number pf chars: "+chars);
//		}
		
		String s1 = "Hello";
		m1(s1);
		System.out.println(s1);
	}

	
	public static void m1(String s1){
		s1 = "world";
		
	}
}
