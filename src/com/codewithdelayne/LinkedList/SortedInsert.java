package com.codewithdelayne.LinkedList;

public class SortedInsert {
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


    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        DoublyLinkedListNode temp = head;
        DoublyLinkedListNode temp1 = head;
        DoublyLinkedListNode node = new DoublyLinkedListNode(data);
        while (temp != null) {
            if (temp.data > data) {
                break;
            }
            temp1 = temp;
            temp = temp.next;
        }
        if (temp == head) {
            node.next = temp;
            temp.prev = node;
            head = node;
        } else if (temp == null) {
            if (head != null) temp1.next = node;
            node.prev = temp1;
        } else {
            temp1.next = node;
            node.prev = temp1;
            temp.prev = node;
            node.next = temp;
        }
        return (head);
    }
}
