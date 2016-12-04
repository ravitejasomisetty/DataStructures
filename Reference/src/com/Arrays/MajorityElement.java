package com.Arrays;

public class MajorityElement {

	
	public static void main(String[] args) {
		int a[] = {2,2,2,2,4,4,4,4,4,6};
		int temp = Majority(a),count=1;
		for(int i=0; i<a.length;i++){
			if(a[temp]==a[i]){
				count++;
			}
		}
		if(count>a.length/2){
			System.out.println(a[temp]);
		}else{
			System.out.println("none");
		}
	}

	private static int Majority(int[] arr) {
		int count =1,maj= 0;
		for(int j=1;j<arr.length;j++){
			if(arr[maj]==arr[j]){
				count++;
			}else{
				count--;
			}
			if(count==0){
				maj = j;
				count=1;
			}
		}
		
		return maj;
	}

}
