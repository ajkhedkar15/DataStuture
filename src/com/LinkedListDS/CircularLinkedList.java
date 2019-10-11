package com.LinkedListDS;

public class CircularLinkedList {

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    Node head;

    public boolean checkIfCircular(Node head){
        //1. Check if head is empty - empty is circular linked list
        if (head ==null)return true;

        Node node = head.next;

        while (node!=null && node!=head){
            node =node.next;
        }

        return (node==head);
    }
}
