package com.codewithdelayne;

import org.w3c.dom.Node;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListElements {
    Node head;


    private class SinglyLinkedListNode{
       private int data;
       private Node next;

        void Node(int d) { data = d; }


    }

    private Node first;
    private Node last;

    static  void printLinkedList(SinglyLinkedListNode head) {
        var node = new Node();


    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(0, 16);
        list.add(1, 13);

        var array = list.toArray();
        System.out.println(Arrays.toString(array));
    }

}