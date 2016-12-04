package com.Arrays;

public class HeapSort {

	public static void main(String[] args) {
		int a[] = {1,3,5,2,4};
		buildHeap(a);
		for(int i:a)
		System.out.println(i);
		
	}

	private static void buildHeap(int[] a) {
		// TODO Auto-generated method stub
		int len = a.length-1;
		for(int i=len/2;i>=0;i--){
			maxHeap(a,i,len);
		}
		for(int i:a)
			System.out.print(i+" ");
		//o(n)
		System.out.println();
		for (int i = len; i >= 0; i--)
        {
            swap(a,i, 0);
            len = len-1;
            maxHeap(a, 0,len);
        }
	}

	private static void maxHeap(int[] a, int i, int len) {
		int l = i*2;
		int r = i*2+1;
		int lar =0;
		if(l<=len && a[l]>a[i]){
			lar = l;
		}else{
			lar = i;
		}
		if(r<=len && a[r]>a[lar]){
			lar = r;
		}
		if(lar!=i){
			swap(a,i,lar);
			maxHeap(a,lar,len);
		}
		
	}

	private static void swap(int[] a, int i, int lar) {
		// TODO Auto-generated method stub
		int temp = a[i];
		a[i] = a[lar];
		a[lar] = temp;
	}

}
