package com.trees.java;

import java.util.*;
public class AdjacencyList 
{
	Node node;
	public Map<Integer,Node> adjacencyList = new HashMap<Integer,Node>();
	public AdjacencyList(int vertex)
	{
		node = new Node();
		for (int i = 1; i <= vertex; i++)
			adjacencyList.put(i,node );
	}
	public void defineEdge(int u,int v,int wt)
	{		
		node = adjacencyList.get(v);
		node.weight= wt;
		LinkedList<Integer> vlist = new LinkedList<Integer>();
		vlist.add(u);
		node.ll = vlist;
	}
	public Node getEdge(int u)
	{
		return adjacencyList.get(u);
	}
	public static void main(String args[]) 
	{
		int vertex,edge,u,v,count=1;
		Scanner scan= new Scanner(System.in);
		try
		{
			System.out.println("Enter the number of Vertices:");
			vertex=scan.nextInt();
			System.out.println("Enter the number of Edges:");
			edge=scan.nextInt();
			AdjacencyList adjList = new AdjacencyList(vertex);
			System.out.println("Define the edges from vertex to vertex:");
			while(count<=edge)
			{
				v=scan.nextInt();
				u=scan.nextInt();
				int wt=0;
				adjList.defineEdge(u,v,wt);
				count++;
			}
			System.out.println("Adjacency List Representation of the Graph:");
			for(int i=1;i<=vertex;i++)
			{
				System.out.print(i+ "->");
				Node edgeList = adjList.getEdge(i);
				for(int j=1;;j++)
				{
					if(j!=edgeList.ll.size())
						System.out.print(edgeList.ll.get(j-1)+ "->");
					else 
					{
						System.out.print(edgeList.ll.get(j-1));
						break;
					}
				}
				System.out.println();
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}	
	}
	
class Node{
	int weight;
	List<Integer> ll;
	Node(){
		ll = new LinkedList<Integer>();
		weight = 0;
	}
	
}
}

