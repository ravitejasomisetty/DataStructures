
import binarytree.BinaryTree;
import binarytree.BinaryTreeNode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RavitejaSomisetty
 */
public class TreeDriver {
    
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        BinaryTreeNode bn = bt.newNode(10);
        BinaryTreeNode bn1 = bt.newNode(20);
        BinaryTreeNode bn2 = bt.newNode(30);
        BinaryTreeNode root = bn;
        bn.left = bn2;
        bn.right = bn1;
        bt.preOrderTraversal(root);

    }
    
}
