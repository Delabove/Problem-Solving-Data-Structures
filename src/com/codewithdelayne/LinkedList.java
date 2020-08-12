package com.codewithdelayne;


public class LinkedList {

    static class SinglyLinkedListNode{
        int data;
        SinglyLinkedListNode next;


        public SinglyLinkedListNode(int data) {
        }
    }

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode temp = head;
        SinglyLinkedListNode insertNode = new SinglyLinkedListNode(data);

        if(head == null) {
            return insertNode;
        }

        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next  = insertNode;
        insertNode.next = null;

        return head;
    }

}
