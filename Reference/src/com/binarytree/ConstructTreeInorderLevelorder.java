package com.binarytree;

public class ConstructTreeInorderLevelorder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inOrdr = {4,2,5,1,6,3,7};
		int[] levelOrdr = {1,2,3,4,5,6,7};
		Traversals.inOrder(construct(new BinaryTree(),inOrdr,levelOrdr,0,inOrdr.length-1));
	}

	private static BinaryTree construct(BinaryTree binaryTree, int[] inOrdr, int[] levelOrdr, int inStart,
			int inEnd) {
		// TODO Auto-generated method stub
		if(inStart>inEnd) return null;
		if(inStart == inEnd) return new BinaryTree(inOrdr[inStart]);
		int index = 0; boolean flag = false;
		for(int i =0;i<levelOrdr.length-1;i++){
			int temp = levelOrdr[i];
			//System.out.println("temp : "+temp);
			for(int j = inStart;j<inEnd;j++){
				if(temp == inOrdr[j]){
					//System.out.println("found");
					binaryTree = new BinaryTree(temp);
					flag = true;
					index = j;
					break;
				}				
			}
			if(flag) break;		
		}
		//System.out.println("data: "+binaryTree.data);
		binaryTree.left = construct(binaryTree, inOrdr,levelOrdr,inStart,index-1);
		//System.out.println("left data: "+binaryTree.data);
		binaryTree.right = construct(binaryTree, inOrdr,levelOrdr,index+1,inEnd);
		return binaryTree;

	}

}
