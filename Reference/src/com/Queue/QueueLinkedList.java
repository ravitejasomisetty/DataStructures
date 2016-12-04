package com.Queue;

import com.LinkedList.Node;

public class QueueLinkedList {

	Node<Integer> front,back;
	int data;
	public QueueLinkedList(){
	}
	
	public void enQueue(int data){
		if(back == null && front == null){
			back = new Node<Integer>(data);
			front = new Node<Integer>(data);
			front = back;
		}else if(back!=null && front !=null){
			back.next = new Node<Integer>(data);
		//	System.out.println("next "+back.next.element);
			back = back.next;
		}
	}
	public Integer deQueue(){
		Node<Integer> temp = null;
		if(front==null){
			System.out.println("Underflow");
		}else{
			temp = front;
			front = front.next;
		}
		if(front==null){
			back = null;
		}
		return temp.element;
	}
	public boolean IsEmpty(){
		return (front==null ? true:false);
	}
	
	public Integer Peek(){
		
		return front.element;
	}
	
	public static void main(String[] args) {
		QueueLinkedList queue = new QueueLinkedList();
		
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());


	}

}
