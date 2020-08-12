package com.codewithdelayne;

import org.w3c.dom.Node;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListElements {



    private class SinglyLinkedListNode{
       private int data;
       private SinglyLinkedListNode next;

    }


    static  void printLinkedList(SinglyLinkedListNode head) {
       SinglyLinkedListNode temp = head;

       while (temp != null){
           System.out.println(temp.data);

           temp = temp.next;
       }


    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(0, 16);
        list.add(1, 13);

        var array = list.toArray();
        System.out.println(Arrays.toString(array));
    }

}