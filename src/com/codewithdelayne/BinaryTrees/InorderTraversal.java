package com.codewithdelayne.BinaryTrees;

import java.util.Scanner;

public class InorderTraversal {

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

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.printf("%s ", root.data);
        inOrder(root.right);

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
        inOrder(root);
    }


}

//During the in-order traversal algorithm, the left subtree is explored first, followed by root, and finally nodes on the right subtree.
//
//start traversal from root then go to the left node,
// then again go to the left node until you reach a leaf node.
// At that point in time, you print the value of the node or
// mark it visited and moves to the right subtree.
// Continuing the same algorithm until all nodes of the binary tree are visited.
// The InOrder traversal is also known as the left-node-right or
// left-root-right traversal or LNR traversal algorithm.
//
// it is also a depth-first algorithm because it explores the depth of a binary tree before exploring siblings.
// Since it is one of the fundamental binary tree algorithms it's quite popular in programming interviews.
//
//The easiest way to implement the inOrder traversal algorithm in Java or
// any programming language is by using recursion.
// Since the binary tree is a recursive data structure,
// recursion is the natural choice for solving a tree-based problem.
// The inOrder() method in the BinaryTree class implements the logic to traverse a binary tree using recursion.
//
//From the Interview point of view, InOrder traversal is extremely important
// because it also prints nodes of a binary search tree in the sorted order
// but only if the given tree is a binary search tree. If you remember,
// in BST, the value of nodes in the left subtree is lower than the root,
// and the values of nodes on the right subtree are higher than the root.
// The In order traversal literally means IN order i.e notes are printed in the order or sorted order.
//
//
