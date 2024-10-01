package org.example;

public class Stack {

    Node head;

    public Stack(){
        this.head = null;
    }

    boolean isEmpty(){
        return head == null;
    }

    public void push(int data){
        Node newNode = new Node(data);

        newNode.top = head;

        head = newNode;
    }

    public void pop(){
        if(isEmpty()){
            return;
        }

        head = head.top;
    }

    public int peek(){

        if(!isEmpty()){
            return head.data;
        }
        else{
            return -1;
        }
    }

    public void traverse(){
        if(isEmpty()){
            return;
        }
        System.out.print(head.data + " ");
        head = head.top;
        traverse();
    }

}
