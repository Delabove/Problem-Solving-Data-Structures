package com.codewithdelayne.Trees;

import java.util.Scanner;

public class PreorderTraversal {
    // must print the values in the tree's preorder
    // traversal as a single line of space-separated values.

    static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.printf("%s ", root.data);
        preOrder(root.left); preOrder(root.right);
    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        preOrder(root);
    }
}







//While traversing a tree, you need to visit three elements, root node, left subtree, and right subtree. The order in
// which you visit these three nodes, determine the type of algorithms.
// In PreOrder, you visit the root or node first, followed by left subtree and the right subtree,
// but in post order algorithm, you visit the root node at the last.
// the order is determined by root, if you visit the root first, its preOrder, if you visit the root second its inOrder and if you visit the root third, or last, its post-order traversal.
//
// On breadth-first traversal, you visit the tree on its breadth
// i.e. all nodes of one level are visited before you start with another level top to bottom.
// The PreOrder, InOrder, and PostOrder traversals are all examples of depth-first traversal algorithms.
//
//