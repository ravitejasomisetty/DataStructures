/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author RavitejaSomisetty
 */
public class BinaryTreeNode {
    public BinaryTreeNode left;
    public BinaryTreeNode right;
    Object data;
    
    public BinaryTreeNode(Object d)
    {
        this.data=d;
        this.left=null;
        this.right=null;
    }
    
}
