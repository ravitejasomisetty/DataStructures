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
public class BinaryTree {

    /**
     * @param args the command line arguments
     */
    public BinaryTreeNode newNode(Object data) {
        BinaryTreeNode btn = new BinaryTreeNode(data);
        return btn;
    }

    public void preOrderTraversal(BinaryTreeNode root) {
        if (root == null) {
            return;
        }
        this.preOrderTraversal(root.left);
        System.out.println(root.data);
        //this.preOrderTraversal(root);
        this.preOrderTraversal(root.right);
    }

    public int height(BinaryTreeNode root) {
        int leftHeight = 0, rightHeight = 0;
        if (root == null) {
            return -1;
        }
        BinaryTreeNode traversingNode = null;
        while ((traversingNode = root.left) != null) {
            leftHeight++;
        }
        while ((traversingNode = root.right) != null) {
            rightHeight++;
        }
        return Math.max(leftHeight, rightHeight);
    }

}
