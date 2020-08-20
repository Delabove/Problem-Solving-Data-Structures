package com.codewithdelayne.LinkedList;

import com.codewithdelayne.LinkedList.LinkedListElements;

import java.util.LinkedList;

public class MergeLinkedLists {
    private static class SinglyLinkedListNode{
        private int data;
        private SinglyLinkedListNode next;

        public SinglyLinkedListNode(int data) {
            this.data = data;
        }
    }


    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        if (head1 == null){
            return head2;
        }
        if (head2 == null){
            return head1;
        }
        if (head1.data < head2.data){
            head1.next = mergeLists(head1.next, head2);
            return head1;
        }
        else {
            head2.next = mergeLists(head1, head2.next);
            return head2;
        }

    }

    static  void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode temp = head;

        while (temp != null){
            System.out.println(temp.data);

            temp = temp.next;
        }


    }


}


//      Question Analysis

//
//  given:  pointer to the head nodes of two sorted linked lists
//  sorted in ascending order
//
// Change the next pointers to obtain a single, sorted merged linked list (ascending)
//
// Either head pointer given may be null meaning that the corresponding list is empty.
//
//
//
//
//
//
