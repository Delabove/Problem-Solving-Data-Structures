package com.codewithdelayne.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class GetNodeValue {


    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }
        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

        static int getNode(SinglyLinkedListNode head, int positionFromTail) {

        SinglyLinkedListNode pointer = head;
        int counter = 0;

        while(head != null){
            head = head.next;
            if(counter < positionFromTail){
                counter++;
            } else if(head!= null) {
                pointer = pointer.next;
            }

        }

        return pointer.data;
    }


    static  void printLinkedList(SinglyLinkedListNode head) {
       SinglyLinkedListNode temp = head;

        while (temp != null){
            System.out.println(temp.data);

            temp = temp.next;
        }


    }


}

//
//
// Counting backwards from the tail node of the linked list, get the value of
// the node at the given position.
//
// A position of 0 corresponds to the tail,
// 1 corresponds to the node before the tail and so on.
//
//
//
//
//
