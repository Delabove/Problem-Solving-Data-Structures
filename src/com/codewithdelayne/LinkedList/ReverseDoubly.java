package com.codewithdelayne.LinkedList;

public class ReverseDoubly {
    static class DoublyLinkedListNode {
        public int data;
        public DoublyLinkedListNode next;
        public DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
            this.prev = null;
        }


    }


    static class DoublyLinkedList {
        public DoublyLinkedListNode head;
        public DoublyLinkedListNode tail;

        public DoublyLinkedList() {
            this.head = null;
            this.tail = null;
        }
        public void insertNode(int nodeData) {
            DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
                node.prev = this.tail;
            }

            this.tail = node;
        }
    }


        static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
        if (head == null) {
            return null;
        }
        while (head != null) {
            DoublyLinkedListNode i = head.prev;
            head.prev = head.next;
            head.next = i;
            if (head.prev == null) {
                return head;
            }
            head = head.prev;
        }
        return head;
    }

    }
