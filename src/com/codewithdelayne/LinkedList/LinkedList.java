package com.codewithdelayne.LinkedList;


public class LinkedList {

    static class SinglyLinkedListNode{
        int data;
        int position;
        public SinglyLinkedListNode next;



        public SinglyLinkedListNode(int data, int position) {

            this.data= data;
            this.position= position;
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
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
       SinglyLinkedListNode headnode = head;
       headnode.data = data;
       headnode.next = null;

        if (position < 1)
            System.out.print("Invalid position");

        // if position is 1 then new node is
        // set infornt of head node
        // head node is changing.
        if (position == 1) {
           SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
            newNode.next = head;
            head = newNode;
        } else {
            while (position-- != 0) {
                if (position == 1) {
                    // adding Node at required position
                    SinglyLinkedListNode newNode = GetNode(data);

                    // Making the new Node to point to
                    // the old Node at the same position
                    newNode.next = head.next;

                    // Replacing current with new Node
                    // to the old Node to point to the new Node
                    head.next = newNode;
                    break;
                }
                head = head.next;
            }
            if (position != 1)
                System.out.print("Position out of range");
        }
        return head;

    }
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
        SinglyLinkedListNode head = GetNode(16);
        head.next = GetNode(3);
        head.next.next = GetNode(7);
        head.next.next.next = GetNode(1);


        System.out.print("Linked list before insertion: ");
        PrintList(head);

        int data = 1; position = 2;
        head = insertNodeAtPosition(head, data, position);
        System.out.print("Linked list after" + " insertion of 1 at position 2: ");
        PrintList(head);

        // middle of the linked list
        data = 1;
        position = 4;
        head = insertNodeAtPosition(head, data, position);
        System.out.print("Linked list after" + "insertion of 1 at position 1: ");
        PrintList(head);

        // insertion at end of the linked list
      // list data = 15;
//        pos = 7;
//        head = insertNodeAtTail(head, data);
//        System.out.print("Linked list after" + " insertion of 15 at position 7: ");
//        PrintList(head);
    }
}




