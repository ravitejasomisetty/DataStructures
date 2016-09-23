/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heaptree;

import binarytree.BinaryTreeNode;

/**
 *
 * @author RavitejaSomisetty
 */
public class HeapTree {

    BinaryTreeNode root = null;
    public static int MINHEAP = 0, MAXHEAP = 1;

    public HeapTree(BinaryTreeNode root) {
        this.root = root;
    }

    public void insertNode(BinaryTreeNode node, int minmax) {
        if (minmax == HeapTree.MAXHEAP) {
        } else {
        }
    }

}
