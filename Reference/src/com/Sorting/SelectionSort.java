package com.Sorting;

public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,1,12,-5,16,2,12,14};
		Selection(a);
		Insertion(a);
	}

	private static void Selection(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++){
			int k =i;
			for(int j=i;j<a.length;j++){				
				if(a[k] > a[j]){
					k = j;
				}				
			}
			int temp = a[i];
			a[i] = a[k];
			a[k] = temp;			
		}
		
		for(int l : a){
			System.out.print(l+ " ");
		}
		System.out.println();
	}
	
	private static void Insertion(int[] input){
		int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        for(int l : input){
			System.out.print(l+ " ");
		}
	}

}
