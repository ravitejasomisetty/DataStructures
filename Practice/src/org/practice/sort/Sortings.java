/**
 * @author Raviteja Somisetty
 *
 * 
 */
package org.practice.sort;

import java.util.Arrays;

public class Sortings<T> {

	//O(N ^ 2)
	public void BubbleIntegerSort(T[] A) {
		for (int j = 0; j < A.length - 1; j++)
			for (int i = 0; i < A.length - 1 - j; i++) {
				if ( (Integer)A[i] > (Integer)A[i + 1]) {
					swapElements(i, i + 1, A);
				}
			}

		printArray("Bubble sorted: ",A);
	}
	
	public void InsertionIntegerSort(T[] A){
		//
		for(int i=1;i<A.length;i++){
			/*
			 * Let j be the pointer for sorted sequence, i be the 
			 * pointer for remaining portion of elements to be sorted*/
			int j=i-1;
			T temp = A[i];
			
			/* Array insertion logic:
			 * Create space for new element in the sorted sequence
			 * Keep moving elements to upper level till the position
			 * where unsorted A[i] is to be placed
			 * E.g.: Given: Sorted sequence: 1 2 5 7, unsorted ith Element: 4
			 *        Step1: Create space for element 4: 1 2 _ 5 7
			 *        Step2: Insert it: 1 2 4 5 7
			 * */
			while(j>=0 && (Integer)A[j]>(Integer)temp){
				A[j+1]= A[j];
				j--;
			}
			A[j+1] = temp;
		}
		printArray("Insertion sorted: ",A);
	}
	
	/*Private helpers*/
	private void swapElements(int i, int j, T[] A) {
		T extra = A[i];
		A[i] = A[j];
		A[j] = extra;
	}

	private void printArray(String msg,T[] A) {
		System.out.println(msg+Arrays.toString(A));
	}


}
