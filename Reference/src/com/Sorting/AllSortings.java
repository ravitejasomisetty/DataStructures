package com.Sorting;

public class AllSortings {
	static int[] arr = {1,7,4,9,13,6,2};
	public static void main(String[] args) {
			// TODO Auto-generated method stub
		
		//bubblesort(arr);
		//Insertion(arr);
		Selection(arr);
		int[] temp = new int[arr.length];
		//mergeSort(arr);
		print(arr);
		
	}
	 public static int[] mergeSort(int [] list) {
	        if (list.length <= 1) {
	            return list;
	        }
	        
	        // Split the array in half
	        int[] first = new int[list.length / 2];
	        int[] second = new int[list.length - first.length];
	        System.arraycopy(list, 0, first, 0, first.length);
	        System.arraycopy(list, first.length, second, 0, second.length);
	        
	        // Sort each half
	        mergeSort(first);
	        mergeSort(second);
	        
	        // Merge the halves together, overwriting the original array
	        merge(first, second, list);
	        return list;
	    }
	    
	    private static void merge(int[] first, int[] second, int [] result) {
	        // Merge both halves into the result array
	        // Next element to consider in the first array
	        int iFirst = 0;
	        // Next element to consider in the second array
	        int iSecond = 0;
	        
	        // Next open position in the result
	        int j = 0;
	        // As long as neither iFirst nor iSecond is past the end, move the
	        // smaller element into the result.
	        while (iFirst < first.length && iSecond < second.length) {
	            if (first[iFirst] < second[iSecond]) {
	                result[j] = first[iFirst];
	                iFirst++;
	                } else {
	                result[j] = second[iSecond];
	                iSecond++;
	            }
	            j++;
	        }
	        // copy what's left
	        System.arraycopy(first, iFirst, result, j, first.length - iFirst);
	        System.arraycopy(second, iSecond, result, j, second.length - iSecond);
	    }

	private static void Selection(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++){
			int min = i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[min]<arr[j]) min = j;				
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min]= temp;
		}
	}

	private static void Insertion(int[] arr) {
		// TODO Auto-generated method stub
		
	}

	private static void print(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+ " ");
		}
	}

	private static void bubblesort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++){
			for(int j=1;j<arr.length;j++){
				if(arr[j-1]>arr[j]){
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j]= temp;
				}
			}
		}
	}
	

}
