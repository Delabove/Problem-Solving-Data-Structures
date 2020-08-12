package com.codewithdelayne.LinkedList;


public class LinkedList {

    static class SinglyLinkedListNode{
        int data;
        public SinglyLinkedListNode next;



        public SinglyLinkedListNode(int data) {

            this.data= data;
        }

    }
    static SinglyLinkedListNode GetNode(int data) {
        return new SinglyLinkedListNode(data);
    }

    public static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode first= head;
        SinglyLinkedListNode insertNode = new SinglyLinkedListNode(data);


        if(head == null) {
            return insertNode;
        }

        while(first.next != null) {
            first = first.next;
        }
        first.next  = insertNode;
        insertNode.next = null;

        return head;
    }

    static SinglyLinkedListNode insertNodeAtTail( SinglyLinkedListNode llist, int data) {

        SinglyLinkedListNode last = llist;
        SinglyLinkedListNode insertNode = new SinglyLinkedListNode(data);

        last.next = insertNode;
        insertNode.next = null;

        return llist ;
    }
//    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
//
//
//    }
    static void PrintList(SinglyLinkedListNode node) {
        while (node != null) {
            System.out.print(node.data);
            node = node.next;
            if (node != null)
                System.out.print(",");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        SinglyLinkedListNode head = GetNode(3);
        head.next = GetNode(5);
        head.next.next = GetNode(8);
        head.next.next.next = GetNode(10);

        System.out.print("Linked list before insertion: ");
        PrintList(head);

        int data = 12, pos = 3;
        head = insertNodeAtHead(head, data);
        System.out.print("Linked list after" + " insertion of 12 at position 3: ");
        PrintList(head);

        // front of the linked list
        data = 1;
        pos = 1;
        head = insertNodeAtHead(head, data);
        System.out.print("Linked list after" + "insertion of 1 at position 1: ");
        PrintList(head);

        // insetion at end of the linked list
        data = 15;
        pos = 7;
        head = insertNodeAtTail(head, data);
        System.out.print("Linked list after" + " insertion of 15 at position 7: ");
        PrintList(head);
    }
}




