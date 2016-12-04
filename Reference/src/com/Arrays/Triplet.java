package com.Arrays;

public class Triplet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,4,6,8,10,45};
		find(a,22);
	}

	private static void find(int[] a, int target) {
		int left = 0,right = a.length-1;
		for(int i = 0;i<a.length;i++){
			left =i+1;
			while(left<right){
				if(target == a[i]+a[left]+a[right]){
					System.out.println("triplet found : "+ a[i] + " "+a[left]+ " "+a[right]);
					left++;right--;
				}else if(target-a[i] < a[left]+a[right]){
					right--;
				}else{
					left++;
				}
			}
			
		}
		
	}

	

}
