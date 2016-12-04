package com.Stack;


public class Node<V> {
	
	public V element;
	public Node<V> next;
	
	public Node(V input){
		this.element = input;
		this.next  = null;
	}
	public Node(){
		
	}
	public Node(V input,Node<V> next ){
		this.element = input;
		this.next = next;
	}
	
	
	public static Node<Integer> getInput(){
		Node<Integer> six = new Node<Integer>(6);
		Node<Integer> five = new Node<Integer>(5,six);
		Node<Integer> four = new Node<Integer>(4,five);
		Node<Integer> three = new Node<Integer>(3,four);
		Node<Integer> two = new Node<Integer>(2,three);
		Node<Integer> one = new Node<Integer>(1, two);
		return one;
	}
	public static Node<Integer> getSortedInput(){
		Node<Integer> dup3 = new Node<Integer>(5);
		Node<Integer> five = new Node<Integer>(5,dup3);
		Node<Integer> four = new Node<Integer>(4,five);
		Node<Integer> three = new Node<Integer>(3,four);
		Node<Integer> dup2 = new Node<Integer>(2,three);
		Node<Integer> dup1 = new Node<Integer>(2,dup2);
		Node<Integer> two = new Node<Integer>(2,dup1);
		Node<Integer> one = new Node<Integer>(1, two);
		return one;
	}
	public static Node<Integer> getUnsortedInput(){
		Node<Integer> dup1 = new Node<Integer>(8);
		Node<Integer> six = new Node<Integer>(6,dup1);
		Node<Integer> seven = new Node<Integer>(7,six);
		Node<Integer> eight = new Node<Integer>(8,seven);
		Node<Integer> five = new Node<Integer>(5,eight);
		Node<Integer> dup3 = new Node<Integer>(4,five);
		Node<Integer> dup2 = new Node<Integer>(4,dup3);
		Node<Integer> four = new Node<Integer>(4,dup2);
		Node<Integer> three = new Node<Integer>(3,four);
		Node<Integer> two = new Node<Integer>(2,three);
		Node<Integer> one = new Node<Integer>(1, two);
		return one;
	}
	public static Node<Integer> getLoppedInput(){
		Node<Integer> five = new Node<Integer>(5);
		Node<Integer> four = new Node<Integer>(4,five);
		Node<Integer> three = new Node<Integer>(3,four);
		Node<Integer> two = new Node<Integer>(2,three);
		Node<Integer> one = new Node<Integer>(1, two);
		five.next = one.next;
		return one;
	}
	public static Node<Integer> getPalindromeInput(){
		Node<Integer> six = new Node<Integer>(1);
		Node<Integer> five = new Node<Integer>(2,six);
		Node<Integer> four = new Node<Integer>(3,five);
		Node<Integer> middle = new Node<Integer>(7,four);
		Node<Integer> three = new Node<Integer>(3,middle);
		Node<Integer> two = new Node<Integer>(2,three);
		Node<Integer> one = new Node<Integer>(1, two);
		return one;
	}
	public static Node<Integer> getGreaterValues(){
		Node<Integer> sixteen = new Node<Integer>(3);
		Node<Integer> six = new Node<Integer>(2,sixteen);
		Node<Integer> five = new Node<Integer>(6,six);
		Node<Integer> four = new Node<Integer>(5,five);
		Node<Integer> middle = new Node<Integer>(11,four);
		Node<Integer> three = new Node<Integer>(10,middle);
		Node<Integer> two = new Node<Integer>(15,three);
		Node<Integer> one = new Node<Integer>(12, two);
		return one;
	}
	public static Node<Integer> getEvenOdds(){
		Node<Integer> sixteen = new Node<Integer>(1);
		Node<Integer> six = new Node<Integer>(4,sixteen);
		Node<Integer> five = new Node<Integer>(5,six);
		Node<Integer> four = new Node<Integer>(10,five);
		Node<Integer> middle = new Node<Integer>(12,four);
		Node<Integer> three = new Node<Integer>(8,middle);
		Node<Integer> two = new Node<Integer>(15,three);
		Node<Integer> one = new Node<Integer>(17, two);
		return one;
	}
	public static Node<Integer> getNumber563(){
		Node<Integer> three = new Node<Integer>(3);
		Node<Integer> two = new Node<Integer>(6,three);
		Node<Integer> one = new Node<Integer>(5, two);
		return one;
	}
	public static Node<Integer> getNumber842(){
		Node<Integer> two = new Node<Integer>(5);
		Node<Integer> one = new Node<Integer>(4, two);
		return one;
	}
}
