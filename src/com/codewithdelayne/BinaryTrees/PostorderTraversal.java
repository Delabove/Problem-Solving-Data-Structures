package com.codewithdelayne.BinaryTrees;

public class PostorderTraversal {


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
    public static void postOrder(Node root) {
        //recursion
        if(root !=  null) {
            postOrder(root.left);
            postOrder(root.right);

            System.out.printf("%d ",root.data);
        }


        //iterative
//        if( root == null ) return;
//
//        Stack<TreeNode> s = new Stack<TreeNode>( );
//        TreeNode current = (TreeNode) root;
//
//        while( true ) {
//
//            if( current != null ) {
//                if( current.right != null )
//                    s.push( current.right );
//                s.push( current );
//                current = current.left;
//                continue;
//            }
//
//            if( s.isEmpty( ) )
//                return;
//            current = s.pop( );
//
//            if( current.right != null && ! s.isEmpty( ) && current.right == s.peek( ) ) {
//                s.pop( );
//                s.push( current );
//                current = current.right;
//            } else {
//                System.out.print( current.data + " " );
//                current = null;
//            }
//        }



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



}


//PostOrder traversal
//In PostOrder traversal, each node is processed after subtrees traversal.In simpler words,Visit left subtree,  right subtree and then node.
//Steps for PostOrder traversal are:
//Traverse the left subtree in PostOrder.
//Traverse the right subtree in PostOrder.
//Visit the node.


//There can be two ways of implementing it
//
//Recursive
//Iterative