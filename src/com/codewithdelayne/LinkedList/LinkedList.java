package com.codewithdelayne.LinkedList;


public class LinkedList {

    SinglyLinkedListNode head;

    static class SinglyLinkedListNode{

        int data;
        public SinglyLinkedListNode next;



        public SinglyLinkedListNode(int d) {

            this.data= d;
            next = null;
        }

    }
    public static SinglyLinkedListNode constructList()
    {
        SinglyLinkedListNode first = new SinglyLinkedListNode(1);
        SinglyLinkedListNode second = new SinglyLinkedListNode(2);
        SinglyLinkedListNode last = new SinglyLinkedListNode(3);




        return head;
    }

    public static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode head, int data) {
        //4 step process

        //1. Allocate node and data
        SinglyLinkedListNode first= head;
        SinglyLinkedListNode new_node = new SinglyLinkedListNode(data);


        if(head == null) {
            return new_node; //2. if head is null return new node at head
        }

        while(first.next != null) { //3. if node after first is not null, set first pointer to next node
            first = first.next;
        }
        first.next  = new_node; //4. make next of first node new node
        new_node.next = null;

        return head;
    }



    static SinglyLinkedListNode insertNodeAtTail( SinglyLinkedListNode llist, int data) {

        SinglyLinkedListNode last = llist;//hackerrank name -this is the tail
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

    //helper function to print given list
    static void PrintList(SinglyLinkedListNode head) {
        while (head != null) {
            System.out.print(head.data);
            head = head.next;
            if (head != null)
                System.out.print(",");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        SinglyLinkedListNode head = GetNode(1);
//        head.next = GetNode(3);
//        head.next.next = GetNode(7);
//        head.next.next.next = GetNode(1);


        System.out.print("Linked list before insertion: ");
        PrintList(head);
//
//        int data = 1; position = 2;
//        head = insertNodeAtPosition(head, data, position);
//        System.out.print("Linked list after" + " insertion of 1 at position 2: ");
//        PrintList(head);
//
//        // middle of the linked list
//        data = 1;
//        position = 4;
//        head = insertNodeAtPosition(head, data, position);
//        System.out.print("Linked list after" + "insertion of 1 at position 1: ");
//        PrintList(head);

        // insertion at end of the linked list
      // list data = 15;
//        pos = 7;
//        head = insertNodeAtTail(head, data);
//        System.out.print("Linked list after" + " insertion of 15 at position 7: ");
//        PrintList(head);
    }
}




