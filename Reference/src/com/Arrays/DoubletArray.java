package com.Arrays;

import java.util.Arrays;

import com.sun.org.apache.xerces.internal.dom.PSVIDOMImplementationImpl;

public class DoubletArray {
	
	public static void main(String[] args)
	{
		int a[]={1,3,5,6,9,10,15,16,20};
		find(a,25);
	}
	
	private static void find(int[] a, int target)
	{
		//Arrays.sort(a);
		int left=0, right=a.length-1;
		
		while(left<right)
		{
			if(target==a[left]+a[right])
			{
				System.out.println("doublet found: "+a[left]+" "+a[right]);
				left++;
				right--;
			}
			else if(a[left]+a[right] <target )
			{
				left++;
				
			}
			else{
				right--;
			}
		}
		
	}
}
