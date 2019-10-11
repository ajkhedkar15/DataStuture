package com.LinkedListDS;

public class LinkedList {

    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data =data;
            next = null;
        }
    }

    //Linked List Insertion
    //1. Add element at the top of linked list
    public void push(int data){
        //1. Create the node with data
        Node new_node = new Node(data);
        //2. add new_node's next element as head
        new_node.next = head;
        //3. assign value of head as new node
        head = new_node;
    }

    //2. Add element at the middle of Linked List
    public void insertAfter(int data, Node prev_node){
        //1. Check whether previous node is empty or not
        if(prev_node == null){
            System.out.println("previous node can't be null");
            return;
        }
        //2. Create a node with new data
        Node new_node = new Node(data);
        //3. new Node's next element is now prev_node's next
        new_node.next = prev_node.next;
        //4. prev_node's next is new_node
        prev_node.next = new_node;
        return;
    }

    //3. Add the data at the end
    public void append(int data){
        //1.Create a new node with data
        Node new_node = new Node(data);
        //2. Check whether linked list is empty or not if yes add data as head
        if(head == null){
            head = new_node;
            return;
        }
        //3. new_node's next element will be null
        new_node.next = null;
        //4. Traverse till the end
        Node last = head;
        while (last.next!=null){
            last =last.next;
        }
        //5. last next element will be new_node
        last.next = new_node;
        return;
    }

    //Deletion in Linked List
    public void deleteKey(int key){
        Node temp =head, prev = null;
        //1, check if head contains key
        if(temp!=null && temp.data ==key){
            head = temp.next;
            return;
        }
        //2.iterate till you find the key
        while (temp != null && temp.data != key){
            prev = temp;
            temp = temp.next;
        }
        //3. if key is not present
        if (temp == null)return;
        //4.change next node
        prev.next = temp.next;
    }
}
