package com.random;

public class HashMap_LL {
	private static final int SIZE = 16;
    private Node2 table[] = new Node2[SIZE];
	HashMap_LL(){}
	
	public void put(String k, String v){
		int hash = k.hashCode()%SIZE;
		Node2 n = table[hash];
		
		if(n!=null){
			if(n.key.equals(k)){
				n.value = v;
			}else{
				while(n.next!=null){					
					n= n.next;
				}
				Node2 entry = new Node2(k, v);
				n.next = entry;
			}
		}else{
			Node2 entry = new Node2(k, v);
			table[hash] = entry;
		}
	}
	public String get(String k){
		int hash = k.hashCode()%SIZE;
		Node2 n = table[hash];
		while(n!=null){
			if(n.key.equals(k)){
				return n.value;
			}
			n = n.next;
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap_LL hm = new HashMap_LL();
		hm.put("ravi", "teja");
		System.out.println(hm.get("ravi"));
	}

}

class Node2{
	String key;
	String value;
	Node2 next;
	
	Node2(String k,String v){
		this.key = k;
		this.value = v;
	}
}
