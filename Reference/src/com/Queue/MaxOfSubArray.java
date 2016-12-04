package com.Queue;

public class MaxOfSubArray {



	public static void main(String[] args) {
		int[] arr = {3,5,2,12,4,10,7,9,2,1,1};		
		MaxSubArray(arr,3);
	}

	private static void MaxSubArray(int[] arr, int k) {
		int temp,i;
		QueueLinkedList queue = new QueueLinkedList();
		for(i=0;i<k ;i++){
			temp = arr[i];
			if(queue.IsEmpty()){
				queue.enQueue(i);
			}else if(arr[queue.Peek()] < temp){
				queue.deQueue();
				queue.enQueue(i);
			}
		}		
		//System.out.println(queue.Peek());
		
		for(;i<arr.length;i++){
			
			System.out.println(arr[queue.Peek()]+" ");
			while(!queue.IsEmpty() && (queue.Peek() <= i- k)){
				queue.deQueue();
			}
			while(!queue.IsEmpty() && (arr[queue.Peek()] <= arr[i])){
				queue.deQueue();				
			}
			queue.enQueue(i);
		}

	}

}
