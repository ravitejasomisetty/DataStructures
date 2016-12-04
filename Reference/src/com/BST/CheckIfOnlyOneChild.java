package com.BST;

public class CheckIfOnlyOneChild {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pre[] = {8,3,5,7,6,9};
		check(pre);	
	}

	private static void check(int[] pre) {
		// TODO Auto-generated method stub
		for(int i=0;i<pre.length-1;i++){
			int first = pre[i]-pre[i+1];
			int last = pre[i] - pre[pre.length-1];
			if(first*last <0){
				System.out.println("False"); break;
			}
		}
	}

}
