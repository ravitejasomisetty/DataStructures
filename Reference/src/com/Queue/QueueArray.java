package com.Queue;

public class QueueArray {

	int[] arr;
	int size;
	int front,rear;
	public QueueArray(int size){
		arr = new int[size];
		this.size = size;
		front = 0;
		rear = 0;
	}
	
	public void enQueue(int data){
		if(rear - front <= size && rear - front >=0){
		arr[rear] = data;
		rear++;
		}else{
			System.out.println("Queue Overflow");
		}
	}
	public int deQueue(){
		int temp =0;
		System.out.println("rear : "+rear);
		System.out.println("front : "+front);
		if(rear - front <= size && rear - front >0){
		temp = arr[front];
		front++;
		}else{
			System.out.println("underflow");
		}
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueArray queue = new QueueArray(3);
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());

	}

}
