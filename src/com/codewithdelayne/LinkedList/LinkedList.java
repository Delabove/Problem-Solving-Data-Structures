package com.codewithdelayne.LinkedList;


//HACKERRANK SINGLYLINKEDLIST//

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



    public static  Node insertNodeAtPosition(int data, int position) {

       Node new_node = new Node(data);
        Node current_node = head;

        int index = 0;

        while(index < position-1){
            current_node = current_node.next;
            index++;
        }

        new_node.next = current_node.next;
        current_node.next = new_node;

        return head;

    }

    static void deleteNode(int position) {
        if (head == null)
            return;


        Node delete = head;
        if (position == 0) {
            delete = delete.next;

        }
        if (position > 0) {
            delete = delete.next;
        }

        for (int i = 0; i < position - 1; i++) {
            delete = delete.next;
        }


        delete.next = delete.next.next;

    }
    static Node reverse(Node head) {
//    if(head == null){return null;}

    Node prev = head;
    Node curr = head;

    while (curr != null){
        Node next = curr;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
        head = prev;

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
        insertNodeAtPosition(4,2);
        insertNodeAtPosition(5,1);
        insertNodeAtPosition(6,5);

        deleteNode( 0);
        deleteNode( 1);
        deleteNode( 2);
//        reverse(head);

        PrintList(head);

    }
}




