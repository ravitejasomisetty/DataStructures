package com.Matrix;

public class PrintDiagonally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1, 2, 3, 4},
		        	   {5, 6, 7, 8},
		               {9, 10, 11, 12},
		               {13, 14, 15, 16},
		               {17, 18, 19, 20},
		    };
		diagonal(arr);
	}

	private static void diagonal(int[][] arr) {
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i][0]+" ");
			int  k= i-1;
			int j = 1;
			while(check(k,j,arr)){
				System.out.print(arr[k][j]+" ");
				k--;j++;
			}
			System.out.println();
		}
		for(int j = 1;j<arr[0].length;j++){
			System.out.print(arr[arr.length-1][j]+" ");
			int k = j+1;
			int i = arr.length-2;
			while(check(i,k,arr)){
				System.out.print(arr[i][k]+" ");
				i--;k++;
			}
			System.out.println();
		}
		
	}

	private static boolean check(int i, int j,int[][] arr) {
		if((i>=0&&i<arr.length) && (j>=0 && j<arr[0].length)) return true;
		return false;
	}

}
