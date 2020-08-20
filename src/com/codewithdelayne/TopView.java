package com.codewithdelayne;

import java.util.*;

public class TopView {

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

        public static void topView(Node root) {
            class QueueObj {
                final Node node;
                final int hd;

                QueueObj(Node node, int hd) {
                    this.node = node;
                    this.hd = hd;
                }
            }
            Queue<QueueObj> q = new LinkedList<QueueObj>();
            Map<Integer, Node> topViewMap = new TreeMap<Integer, Node>();

            if (root == null) {
                return;
            } else {
                q.add(new QueueObj(root, 0));
            }

            // count function returns 1 if the container
            // contains an element whose key is equivalent
            // to hd, or returns zero otherwise.
            while (!q.isEmpty()) {
                QueueObj tmpNode = q.poll();
                if (!topViewMap.containsKey(tmpNode.hd)) {
                    topViewMap.put(tmpNode.hd, tmpNode.node);
                }

                if (tmpNode.node.left != null) {
                    q.add(new QueueObj(tmpNode.node.left, tmpNode.hd - 1));
                }
                if (tmpNode.node.right != null) {
                    q.add(new QueueObj(tmpNode.node.right, tmpNode.hd + 1));
                }

            }
            for (Map.Entry<Integer, Node> entry : topViewMap.entrySet()) {
                System.out.printf("%d ", entry.getValue().data);
            }
        }


        public static Node insert(Node root, int data) {
            if (root == null) {
                return new Node(data);
            } else {
                Node cur;
                if (data <= root.data) {
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
            while (t-- > 0) {
                int data = scan.nextInt();
                root = insert(root, data);
            }
            scan.close();
            topView(root);
        }
    }
///* The proper solution should be to do BFS and keep a count of the
// displacement from the root node and avoid printing subsequent nodes
// with same displacement. However, we just print the nodes on the edge
// of the "christmas tree cone"

//Algorithm
//Create a map to store the top-view of the binary tree.
//Perform inorder traversal of the binary tree.
//During traversal keep track of vertical height(h) and horizontal width(w) of each of the tree nodes.
//For the node being visited currently, check if it’s horizontal width level has been visited or not.
//If the current horizontal level has not been visited then, map the {current horizontal width -> (current node data,current vertical height)}.
//If the current horizontal width level has been visited already then compare vertical height value already mapped for the current horizontal level with a vertical height of the current node.
//If the value of mapped vertical height is greater than the vertical height of current node (this happens when current node lies vertically above the previously mapped node and therefore appears in the top view of the tree superimposing over the previously mapped node) then, simply change the mapped value for current horizontal width to {current node data, current vertical height}. i.e. {current horizontal width -> (current node data,current vertical height)}.
//After the traversal, simply output the top view stored in the map.