/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortings;

/**
 *
 * @author RavitejaSomisetty
 */
public class Sortings {

    /**
     * @param args the command line arguments
     */
    /*int[] a;
     public Sortings(int[] b){
     a = b;}*/
    public static void main(String[] args) {
        int[] a = {5, 7, 2, -1, 10, 100};
        Sortings s = new Sortings();
        System.out.println("Before bubblesort\n");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }

        s.bubbleSort(a);

        System.out.println("\nAfter bubblesort\n");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }

        int[] b = {5, 7, 2, -1, 10, 100};
        a = b;
        System.out.println("\nBefore selectionsort\n");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }

        s.selectionSort(a);

        System.out.println("\nAfter selectionsort\n");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }

        int[] c = {5, 7, 2, -1, 10, 100};
        a = c;
        System.out.println("\nBefore insertion sort\n");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }

        s.insertionSort(a);

        System.out.println("\nAfter insertion sort\n");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }

        int[] d = {8,6,10,3,1,2,5,4};
        a = d;
        System.out.println("\nBefore quick sort\n");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }

        s.quickSort(a, 0, a.length - 1);

        System.out.println("\nAfter quick sort\n");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }

        int[] e = {5, 7, 2, -1, 10, 100};
        a = e;
        System.out.println("\nBefore merge sort\n");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }

        s.mergeSort(a);

        System.out.println("\nAfter merge sort\n");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
    }

    void bubbleSort(int[] b) {
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length - i - 1; j++) {
                if (b[j] > b[j + 1]) {
                    int temp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = temp;
                }
            }
        }
    }

    void selectionSort(int[] b) {
        for (int j = 0; j < b.length; j++) {
            int min = j;
            for (int k = j + 1; k < b.length; k++) {
                if (b[k] < b[min]) {
                    min = k;
                }
            }

            int temp = b[j];
            b[j] = b[min];
            b[min] = temp;
        }
    }

    void insertionSort(int[] b) {
        for (int i = 1; i < b.length; i++) {
            int t = b[i];
            int j;
            for (j = i; j > 0 && b[j - 1] > t; j--) {
                b[j] = b[j - 1];
            }
            b[j] = t;
        }
    }

    void quickSort(int[] b, int start, int end) {
        if (start < end) {
            int pIndex = partition(b, start, end);
            quickSort(b, start, pIndex - 1);
            quickSort(b, pIndex + 1, end);
        }
    }

    int partition(int[] b, int start, int end) {
        int pIndex = start;
        int pivot = b[end];

        for (int i = start; i < end; i++) {
            if (b[i] <= pivot) {
                int temp = b[i];
                b[i] = b[pIndex];
                b[pIndex] = temp;
                pIndex++;
            }

        }

        b[end] = b[pIndex];
        b[pIndex] = pivot;

        return pIndex;
    }

    void mergeSort(int[] b) {
        if (b.length < 2) {
            return;
        }
        int[] left = new int[b.length / 2];
        int[] right = new int[b.length - b.length / 2];
        for (int i = 0; i < b.length/2; i++) {
            left[i] = b[i];
        }
        for (int i =  b.length / 2; i < b.length; i++) {
            right[i-b.length/2] = b[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left, right, b);

    }

    void merge(int[] l, int[] r, int[] a) {
        int i = 0, j = 0, k = 0;
        while (i < l.length && j < r.length) {
            if (l[i] < r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < l.length) {
            a[k++] = l[i++];
        }
        while (j < r.length) {
            a[k++] = r[j++];
        }
    }

}
