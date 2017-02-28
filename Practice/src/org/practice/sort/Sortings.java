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

		printArray(A);
	}
	
	/*Private helpers*/
	private void swapElements(int i, int j, T[] A) {
		T extra = A[i];
		A[i] = A[j];
		A[j] = extra;
	}

	private void printArray(T[] A) {
		System.out.println(Arrays.toString(A));
	}


}
