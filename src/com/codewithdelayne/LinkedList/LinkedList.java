package com.codewithdelayne.LinkedList;


import org.w3c.dom.Node;

public class LinkedList {

    public static Node head;

     static class Node{

        int data;
        public Node next;



        public Node(int data) {

            this.data= data;

        }

    }

    public static Node insertNodeAtTail( int data) {
         Node first = head;

        //1. Allocate node and data
        Node tail = new Node(data);
        tail.data = data;

//        sets the next field of the new node to point to current first node
        tail.next = first;

        if(head == null) {
            return tail; //2. if head is null return new node at head
        } else

        while(first.next != null) { //3. if node after first is not null, set first pointer to next node
           first = first.next;
        }
        first.next  = tail; //4. make next of first node new node
        tail.next = null;

        return head;
    }



    public static Node insertNodeAtHead(int data) {

        Node fourthNode = new Node(data);
        fourthNode.data = data;
        fourthNode.next = head;

        head=fourthNode;
        return head;
    }



    public static Node insertNodeAtPosition(int data, int position) {
        Node node = new Node(data);
        node.data = data;
        node.next = null;

        if (head== null) {
            //if head is null and position is zero then exit.
            if (position != 0) {
                return null;
            } else { //node set to the head.
                head = node;
            }
        }

        if (head != null && position == 0) {
            node.next = head;
            head = node;
            return head;
        }

        Node current = head;
        Node previous = null;

        int i = 0;

        while (i < position) {
            previous = current;
            current = current.next;

            if (current == null) {
                break;
            }

            i++;
        }

        node.next = current;
        previous.next= node;

        return head;
    }

    //helper function to print given list
    static void PrintList(Node head) {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        System.out.println("Original list: ");

        insertNodeAtHead(1);
        insertNodeAtTail(2);
        insertNodeAtHead(3);


        System.out.println("New list with insertions: ");
        insertNodeAtPosition(4, 1);

        PrintList(head);
    }
}




