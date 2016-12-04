package com.Matrix;

public class SpiralForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[][] = { {1,  2,  3,  4,  5,  6},
			        {7,  8,  9,  10, 11, 12},
			        {13, 14, 15, 16, 17, 18}
			    };
		 int k=0,l=0;
		 int m = 6,n = 3;
		 int i = 0;
		 while(k<m && l <n){
			 for(i=l;i<m;i++){
				 System.out.print(a[k][i]+" ");
			 }
			 k++;
			 for(i=k;i<n;i++){
				 System.out.print(a[i][m-1]+" ");
			 }
			 m--;
			 
			 for(i=m;i>=0;i--){
				 System.out.print(a[n-1][i]+" ");
			 }			 
		 }
	}

}
