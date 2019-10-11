package com.StackDS;

/*
                          top
          ||||||||||||||||||  <------- push
          |||||||||||||||||| Last In First out
          ||||||||||||||||||  -------> pop


*/
public class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX];

    Stack(){
        top =-1;
    }

    boolean isEmpty(){
        return (top<0);
    }

    boolean push(int x){
        if(top>= (MAX-1)){
            System.out.println("Stack Overflow");
            return false;
        }else{
            a[++top] = x;
            System.out.println(x+" is pushed into the stack");
            return true;
        }
    }

    int pop(){
        if (top<0){
            System.out.println("Stack underflow");
            return 0;
        }else{
            return a[top--];
        }
    }

    int peek(){
        if (top<0){
            System.out.println("Stack underflow");
            return 0;
        }else{
            return a[top];
        }
    }

    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }

}
