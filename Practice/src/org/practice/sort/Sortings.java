/**
 * @author Raviteja Somisetty
 *
 * 
 */
package org.practice.sort;

import java.util.Arrays;

import org.practice.amazon.Movies.Movie;

public class Sortings<T> {

	// O(N ^ 2)
	public void BubbleIntegerSort(T[] A) {
		for (int j = 0; j < A.length - 1; j++)
			for (int i = 0; i < A.length - 1 - j; i++) {
				if ((Integer) A[i] > (Integer) A[i + 1]) {
					swapElements(i, i + 1, A);
				}
			}

		printArray("Bubble sorted: ", A);
	}

	public void InsertionIntegerSort(T[] A) {
		//
		for (int i = 1; i < A.length; i++) {
			/*
			 * Let j be the pointer for sorted sequence, i be the pointer for
			 * remaining portion of elements to be sorted
			 */
			int j = i - 1;
			T temp = A[i];

			/*
			 * Array insertion logic: Create space for new element in the sorted
			 * sequence Keep moving elements to upper level till the position
			 * where unsorted A[i] is to be placed E.g.: Given: Sorted sequence:
			 * 1 2 5 7, unsorted ith Element: 4 Step1: Create space for element
			 * 4: 1 2 _ 5 7 Step2: Insert it: 1 2 4 5 7
			 */
			while (j >= 0 && (Integer) A[j] > (Integer) temp) {
				A[j + 1] = A[j];
				j--;
			}
			A[j + 1] = temp;
		}
		printArray("Insertion sorted: ", A);
	}

	public void HeapIntegerSort(T[] A) {
		/*
		 * Left child for ith element = 2i+1 Right child for ith element = 2i+2
		 * HEAPIFY(k): Runs top down from kth node MaxHeap(): Perform Heapify(k)
		 * from bottom up => HeapSort: For each of the n elements => (Extract
		 * root element and perform maxHeap for remaining (n-1) elements)
		 */	
		
		//STEP 1: Build max heap
		maxHeap(A,A.length-1);
		
		//STEP 2: Run Heapify at all nodes by extracting max from the root
		for(int i=A.length-1;i>=0;i--)
		{
			printArray(A[0]+" Array =>", A);
			swapElements(0, i, A);
			Heapify(A, 0, i-1);
		}
		
	}

	private void maxHeap(T[] A,int n){
		for(int i=n/2;i>=0;i--)
            Heapify(A,i,n);
		
		printArray("Max heap obtained: => ", A);
	}
	
	private void Heapify(T[] A, int k, int n) {
		if(A[0] instanceof Integer)
		{
			if ((2 * k + 1 <= n) && (Integer) A[k] < (Integer) A[2 * k + 1]) {
				swapElements(k, 2 * k + 1, A);
				Heapify(A, 2 * k + 1,n);
			}

			if ((2 * k + 2 <= n) && (Integer) A[k] < (Integer) A[2 * k + 2]) {
				swapElements(k, 2 * k + 2, A);
				Heapify(A, 2 * k + 2,n);
			}
		}
		else if (A[0] instanceof Movie){
			if ((2 * k + 1 <= n) && ((Movie) A[k]).getRating() < ((Movie) A[2 * k + 1]).getRating()) {
				swapElements(k, 2 * k + 1, A);
				Heapify(A, 2 * k + 1,n);
			}

			if ((2 * k + 2 <= n) && ((Movie) A[k]).getRating() < ((Movie) A[2 * k + 2]).getRating()) {
				swapElements(k, 2 * k + 2, A);
				Heapify(A, 2 * k + 2,n);
			}
		}
	}
	
	
	/* Private helpers */
	private void swapElements(int i, int j, T[] A) {
		T extra = A[i];
		A[i] = A[j];
		A[j] = extra;
	}

	private void printArray(String msg, T[] A) {
		System.out.println(msg + Arrays.toString(A));
	}

}
