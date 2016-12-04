package com.random;

public class BinarySearch {
	 
    private static void binarySearch(int[] inputArr, int key) {
         
        int start = 0;
        int end = inputArr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == inputArr[mid]) {
            	  System.out.println(key + " found at location " + (mid + 1) + ".");
                  break;
            }
            if (key < inputArr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if ( start > end ){
            System.out.println(key + " is not present in the list.\n");
        }
      
    }
  
    public static void main(String[] args) {
         
        BinarySearch mbs = new BinarySearch();
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
        binarySearch(arr, 14);
        int[] arr1 = {6,34,78,123,432,900};
      binarySearch(arr1, 43);
    }
}
