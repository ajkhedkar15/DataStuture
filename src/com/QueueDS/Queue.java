package com.QueueDS;

/*
                        rear              front
                    |   ||||||||||||||||||  |
       Enqueue   ---|   ||||||||||||||||||  |-------Dequeue
                    |   ||||||||||||||||||  |
 */
public class Queue {

   private int front,rear,size;
   private int capacity;
   private int array[];

    public Queue(int capacity){
        this.capacity =capacity;
        front = size =0;
        rear =capacity-1;
        array = new int[capacity];
    }

    boolean isFull(Queue queue){
        return queue.capacity == queue.size;
    }

    boolean isEmpty(Queue queue){
        return queue.size ==0;
    }

    //1. Check is Queue us full
    //2. rear init value =09 but first time add rear =0 as 9+1=10 and 10%10 =0
    // rear 1,2,3,4,5... and so on
    //3. Add item at array;s rear position
    //4. increase size by 1
    void enqueue(int item){
        if (isFull(this))
            return;
        rear = (rear+1)%capacity;
        array[rear]=item;
        size =size+1;
        System.out.println(item+" enqueued in queue");
    }

    //1. check if queue is empty. if empty return
    //2, front is initialized to 0 get the item at 0th position
    //3. change the front value to the next
    //4. Reduced size by 1.
    int dequeue(){
        if (isEmpty(this))
            return Integer.MIN_VALUE;
        int item = array[front];
        front = (front+1)%capacity;
        size = size-1;
        return item;
    }

    int rear(){
        if(isEmpty(this))
            return Integer.MIN_VALUE;
        return array[rear];
    }

    int front(){
        if(isEmpty(this))
            return Integer.MIN_VALUE;
        return array[front];
    }

    public static void main(String[] args) {
        Queue queue = new Queue(10);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

    }
}
