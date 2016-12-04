package com.Queue;

public class PrintBinary {

	
	public static void main(String[] args) {
		print(10);	
	}

	private static void print(int n) {		
		QueueLinkedList queue = new QueueLinkedList();
		queue.enQueue(1);
		for(int i=n;i>0;i--){
			String s1 = ""+queue.deQueue();
			System.out.println(s1);
			String s2 = s1;
			s1 = s1+"0";
			s2 = s2+"1";
			queue.enQueue(Integer.parseInt(s1));
			queue.enQueue(Integer.parseInt(s2));
		}
		
	}

}
