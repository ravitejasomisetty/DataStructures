package com.trees.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;


public class LevelOrderTravel {
	static LinkedList<Integer> list = new LinkedList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TreeNode root = create();
		TreeNode root = create();
		//LevelOrderTrav(root);
		//topView(root);
		//VerticalView(root);
		//ZigZag(root);
		//int height = Height(root);
		//System.out.println(height);
		boolean flag = false;
		//		for(int i=1;i<=height;i++){
		//			ZigZagWithoutstack(root,i,flag);
		//			flag = !flag;
		//		}
		//		
		//		for(int i=1;i<=height;i=i+2){
		//			OddLevelOrder(root,i);
		//			flag = !flag;
		//		}
		int key = 100;
		int[] arr = new int[10];
		//flatten(root);
		//PathtoNode(root,key,arr,0);
		//System.out.println(LCA(root,80,700).data);
		//inorder(root);
//		mirror(root);
//		inorder(root);
		//System.out.println(NumberOfLeaf(root));
		//System.out.println(getDiameter(root)[0]);
		//System.out.println(IsExistPathSum(root,150));
		//Ancestors(root,100);
		 //flag =IsBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
		TreeNode prev = null;
		//flag = IsBST_Inorder(root,prev); 
		//int sum = DiffLevels(root); // diiference btwen sum of odd levels and even levels
		System.out.println(calculateSum(root,new int[40]));
		
	}
	
	public static int calculateSum(TreeNode root, int[] max) {
		if (root == null)
			return 0;
 
		int left = calculateSum(root.left, max);
		int right = calculateSum(root.right, max);
 
		int current = Math.max(root.data, Math.max(root.data + left, root.data + right));
 
		max[0] = Math.max(max[0], Math.max(current, left + root.data + right));
 
		return current;
	}

	private static int DiffLevels(TreeNode root) {
		// TODO Auto-generated method stub
		if(root == null) return 0;
		
		return root.data-DiffLevels(root.left) - DiffLevels(root.right);
	}

	private static boolean IsBST_Inorder(TreeNode root, TreeNode prev) {
		// TODO Auto-generated method stub
		if(root == null) return true;
		if(!IsBST_Inorder(root.left,prev)) return false;
		if(prev!=null && root.data<= prev.data) return false;
		prev = root;
		return IsBST_Inorder(root.right,prev);
	}

	private static boolean IsBST(TreeNode root, int min, int max) {
		
		if(root==null) return true;
		if(root.data<=min || root.data>=max) return false;
		return IsBST(root.left,min,root.data) && IsBST(root.right,root.data,max);
	}
	private static boolean IsBST_method2(TreeNode root) {
			if(root==null) return true;
			//if(root.left!=null && max_val(root.left)>root.data) return false;
			//if(root.right!=null && min_val(root.right)<root.data) return false;
			if(!(IsBST_method2(root.left))|| !(IsBST_method2(root.right))) return false;
			return true;
	}

	private static boolean Ancestors(TreeNode root,int res) {
		// TODO Auto-generated method stub
		if(root == null ) return false;
		if(root.data == res){ return true;}
		if(Ancestors(root.left,res) || Ancestors(root.right,res)){
			System.out.print(root.data+ " ");
			return true;
		}
		return false;			
	}

	/*
	public static int getDiameter(TreeNode root) {        
	    if (root == null)
	        return 0;

	    int rootDiameter = Height(root.left) + Height(root.right) + 1;
	    int leftDiameter = getDiameter(root.left);
	    int rightDiameter = getDiameter(root.right);
	    return Math.max(rootDiameter, Math.max(leftDiameter, rightDiameter));
	}
	*/
	public static int[] getDiameter(TreeNode root) {
	    int[] result = new int[]{0,0};    //1st element: diameter, 2nd: height    
	    if (root == null)  return result;
	    int[] leftResult = getDiameter(root.left);
	    int[] rightResult = getDiameter(root.right);
	    int height = Math.max(leftResult[1], rightResult[1]) + 1;
	    int rootDiameter = leftResult[1] + rightResult[1] + 1;
	    int leftDiameter = leftResult[0];
	    int rightDiameter = rightResult[0];
	    result[0] = Math.max(rootDiameter, Math.max(leftDiameter, rightDiameter));
	    result[1] = height;

	    return result;
	}
	
	private static int SumProp(TreeNode root) {
		// TODO Auto-generated method stub
		if(root == null || root.left==null || root.right==null) return 1;
		int left = 0 ,right=0;
		if(root.left!=null) left = root.left.data;
		if(root.right!=null) right = root.right.data;
		if(root.data == left+right ){
			 SumProp(root.left);  SumProp(root.right);
			return 1;
		}
		return 0;
	}
	private static int NumberOfLeaf(TreeNode root) {
		// TODO Auto-generated method stub
		if(root == null) return 0;
		if(root.left == null && root.right==null) return 1;
		return NumberOfLeaf(root.left)+NumberOfLeaf(root.right);
	}
	private static TreeNode mirror(TreeNode root) {
		// TODO Auto-generated method stub
		if(root ==null) return null;
		else{
			mirror(root.left);
			mirror(root.right);
			TreeNode temp = root.left;
			root.left = root.right;
			root.right = temp;
		}
		return root;
	}
	private static TreeNode LCA(TreeNode root, int a1,int a2){
		if(root == null) return null;
		if(root.data == a1 || root.data == a2 ) return root;
		TreeNode left = LCA(root.left,a1,a2);
		TreeNode right = LCA(root.right,a1,a2);
		if(left!=null && right !=null){
			return root;
		}else if(left!=null){
			return left;
		}else{
			return right;
		}			
	}

	private static void flatten(TreeNode root) {
		// TODO Auto-generated method stub
		Stack<TreeNode> stack = new Stack<TreeNode>();
		//stack.push(root);
		TreeNode node = root;
		while(!stack.isEmpty() || node!=null){

			System.out.println(node.data);
			if(node.right!=null){
				stack.push(node.right);
			}
			if(node.left!=null){ node.right = node.left; node.left = null;}
			else if(!stack.isEmpty()){
				node.right = stack.pop();
			}

			node = node.right;
		}
	}

	private static TreeNode OddLevelOrder(TreeNode root, int i) {
		// TODO Auto-generated method stub
		if(root==null) return null;
		if(i==1) System.out.print(root.data+" ");
		else{
			OddLevelOrder(root.left,i-1);
			OddLevelOrder(root.right,i-1);
		}
		return root;
	}

	

	private static int Height(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null) return 0;

		return Math.max(Height(root.left), Height(root.right))+1;
	}
	private static TreeNode PathtoNode(TreeNode root, int key, int[] arr,int index) {
		// TODO Auto-generated method stub
		if(root == null) return null;
		arr[index]=root.data; 
		if(root.data ==key){
			for(int i=0;i<=index;i++){
				System.out.print(arr[i]+ " ");
			}
			System.out.println();
			return root;
		}else{			
			PathtoNode(root.left,key,arr,index+1);
			PathtoNode(root.right,key,arr,index+1);
		}
		return root;
	}
	private static int IsExistPathSum(TreeNode root, int i) {
		// TODO Auto-generated method stub
		if(root==null) return 0;
		int sub = i-root.data; int sum = 0;
		if(sub==0 && root.left==null && root.right==null ){
			return 1;
		}else{
			if(root.left!=null) sum = sum+IsExistPathSum(root.left,sub);
			if(root.right!=null) sum= sum+IsExistPathSum(root.right,sub);
			return sum;
		}
		
	}

	private static void ZigZagWithoutstack(TreeNode root, int i, boolean flag) {
		// TODO Auto-generated method stub
		if(root==null) return;
		if(i==1) System.out.print(root.data+ " ");
		else{
			if(flag){
				ZigZagWithoutstack(root.left,i-1,flag);
				ZigZagWithoutstack(root.right,i-1,flag);
			}else{
				ZigZagWithoutstack(root.right,i-1,flag);
				ZigZagWithoutstack(root.left,i-1,flag);
			}
		}
	}


	private static void ZigZag(TreeNode root) {
		// TODO Auto-generated method stub
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		Stack<TreeNode> stack1 = new Stack<TreeNode>();
		Stack<TreeNode> stack2 = new Stack<TreeNode>();
		stack1.add(root);

		while(!stack1.isEmpty() || !stack2.isEmpty()){

			while(!stack1.isEmpty() ){
				TreeNode node = stack1.pop();
				System.out.print(node.data+ " ");
				if(node.right!=null)stack2.push(node.right);
				if(node.left!=null)stack2.push(node.left);
			}
			while(!stack2.isEmpty() ){
				TreeNode node = stack2.pop();
				System.out.print(node.data+ " ");
				if(node.left!=null)stack1.push(node.left);
				if(node.right!=null)stack1.push(node.right);
			}
		}
	}

	private static void topView(TreeNode root) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<Integer>();
		Queue<QNode> node = new LinkedList<QNode>();
		node.add(new QNode(root, 0));
		TreeMap<Integer, Integer> display = new TreeMap<Integer, Integer>();
		while(!node.isEmpty()){
			QNode q = node.remove();
			int dist = q.distance;
			TreeNode temp = q.node;
			if(!set.contains(dist)){
				set.add(dist);
				System.out.println(dist);
				display.put(dist, temp.data);
			}				
			if(temp.left!=null)
				node.add((new QNode(temp.left, dist-1)));
			if(temp.right!=null)
				node.add((new QNode(temp.right, dist+1)));
		}
		for(int i : display.keySet()){
			System.out.println(display.get(i));
		}
	}

	private static void LevelOrderTrav(TreeNode root) {
		// TODO Auto-generated method stub
		Queue<TreeNode> node = new LinkedList<TreeNode>();
		node.add(root);
		while(!node.isEmpty()){
			TreeNode temp = node.poll();
			System.out.println(temp.data);

			if(temp.left!=null){
				node.add(temp.left);
			}
			if(temp.right!=null){
				node.add(temp.right);
			}	
		}
	}

	private static void VerticalView(TreeNode root){
		Queue<QNode> node = new LinkedList<QNode>();
		node.add(new QNode(root, 0));
		TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<Integer, ArrayList<Integer>>();
		ArrayList<Integer> al ;
		Set<Integer> ite = new HashSet<Integer>();
		while(!node.isEmpty()){
			QNode n = node.remove();
			int dis = n.distance;
			TreeNode temp = n.node;
			al = new ArrayList<Integer>();
			if(ite.contains(dis)){
				//ite.add(dis);
				al.addAll((ArrayList<Integer>)map.get(dis));
				//System.out.println("ho: "+al);
				al.add(temp.data);			
			}else{	
				ite.add(dis);
				al.add(temp.data);
			}
			//System.out.println(dis);
			map.put(dis,al);

			if(temp.left!=null)
				node.add(new QNode(temp.left,dis-1));
			if(temp.right!=null)
				node.add(new QNode(temp.right,dis+1));
		}
		for(int i : map.keySet()){
			System.out.println(map.get(i));
		}

	}

	private static TreeNode create() {
		TreeNode rootNode = new TreeNode(40);
		TreeNode node20=new TreeNode(20);  
		TreeNode node10=new TreeNode(10);  
		TreeNode node30=new TreeNode(30);  
		TreeNode node60=new TreeNode(60);  
		TreeNode node50=new TreeNode(50);  
		TreeNode node70=new TreeNode(70);  
		TreeNode node80=new TreeNode(80);
		TreeNode node90=new TreeNode(90);
		TreeNode node100=new TreeNode(100);

		rootNode.left=node20;  
		rootNode.right=node60;  

		node20.left=node10;  
		node20.right=node30;  

		node60.left=node50;  
		node60.right=node70; 

		node30.right = node80;
		node80.right = node90;
		node90.right = node100;

		return rootNode;
	}
	private static TreeNode create2() {
		TreeNode rootNode = new TreeNode(10);
		TreeNode node4=new TreeNode(4);  
		TreeNode node1=new TreeNode(1);  
		TreeNode node11=new TreeNode(11);   
		TreeNode node15=new TreeNode(15);  
		TreeNode node7=new TreeNode(7);
		TreeNode node16=new TreeNode(16); 

		rootNode.left=node4;  
		rootNode.right=node15;  

		node4.left=node1; 
		node4.right = node7;

		node15.left=node11;  
		node15.right=node16; 


		return rootNode;
	}
	public static void inorder(TreeNode root){
		if(root==null) return;
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}

}
class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	TreeNode(int data)  
	{  
		this.data=data;  
	} 
}
class QNode{
	int distance;
	TreeNode node;
	public QNode(TreeNode n, int d){
		node = n;
		distance = d;
	}
}


