package com.codewithdelayne.LinkedList;


public class LinkedList {

   public static SinglyLinkedListNode head;

    static class SinglyLinkedListNode{

        int data;
        public SinglyLinkedListNode next;



        public SinglyLinkedListNode(int data) {

            this.data= data;

        }

    }
    //naive function to implement
    public static SinglyLinkedListNode constructList()
    {
        SinglyLinkedListNode first = new SinglyLinkedListNode(1);
        SinglyLinkedListNode last = new SinglyLinkedListNode(2);

        head = first;
        first.next= last;

        return head;
    }

    public static SinglyLinkedListNode insertNodeAtTail( int data) {
        SinglyLinkedListNode first = head;
        //1. Allocate node and data
        SinglyLinkedListNode new_node = new SinglyLinkedListNode(data);
        new_node.data = data;

//        sets the next field of the new node to point to current first node
        new_node.next = head;

        if(head == null) {
            return new_node; //2. if head is null return new node at head
        } else

        while(first.next != null) { //3. if node after first is not null, set first pointer to next node
            first = first.next;
        }
        first.next  = new_node; //4. make next of first node new node
        new_node.next = null;

        return head;
    }



//    static SinglyLinkedListNode insertNodeAtTail( SinglyLinkedListNode llist, int data) {
//
//        SinglyLinkedListNode last = llist;//hackerrank name -this is the tail
//        SinglyLinkedListNode insertNode = new SinglyLinkedListNode(data);
//
//        last.next = insertNode;
//        insertNode.next = null;
//
//        return llist ;
//    }
//    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
//       SinglyLinkedListNode headnode = head;
//       headnode.data = data;
//       headnode.next = null;
//
//        if (position < 1)
//            System.out.print("Invalid position");
//
//        // if position is 1 then new node is
//        // set infornt of head node
//        // head node is changing.
//        if (position == 1) {
//           SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
//            newNode.next = head;
//            head = newNode;
//        } else {
//            while (position-- != 0) {
//                if (position == 1) {
//                    // adding Node at required position
//////                    SinglyLinkedListNode newNode = GetNode(data);
////
////                    // Making the new Node to point to
////                    // the old Node at the same position
////                    newNode.next = head.next;
////
////                    // Replacing current with new Node
////                    // to the old Node to point to the new Node
////                    head.next = newNode;
////                    break;
////                }
////                head = head.next;
////            }
////            if (position != 1)
////                System.out.print("Position out of range");
////        }
//        return head;
//
//    }

    //helper function to print given list
    static void PrintList(SinglyLinkedListNode head) {
        SinglyLinkedListNode ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        System.out.println("Original list: ");
        SinglyLinkedListNode head = constructList();
        insertNodeAtTail(3);

        PrintList(head);
    }
}




