package com.codewithdelayne.LinkedList;


public class LinkedList {

    static class SinglyLinkedListNode{
        int data;

        SinglyLinkedListNode next;


        public SinglyLinkedListNode(int data) {
        }
    }

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
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

    static SinglyLinkedListNode insertNodeAtHead( SinglyLinkedListNode llist, int data) {

        SinglyLinkedListNode last = llist;
        SinglyLinkedListNode insertNode = new SinglyLinkedListNode(data);

        last.next = insertNode;
        insertNode.next = null;

        return llist ;
    }
}
