package org.example;

public class Node {

    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }

    public static void traverse(Node head){
        Node current = head;

        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static boolean searchItem(Node head , int value){
        while(head != null) {
            if(head.data == value){
                return true;
            }
            head = head.next;
        }

        return false;
    }

    public static int calculateLengthOfLinkedList(Node head){
        int length = 0;
        while(head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

    public static Node insertAtLast(Node head , int value){
        Node newNode = new Node(value);

        if(head == null){
            head = newNode;
            return head;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    public static Node insertAtBegin(Node head , int value){
        Node newNode = new Node(value);

        newNode.next = head;

        head = newNode;

        return head;
    }

    public static Node insertAtPos(Node head , int value , int pos){
        if (pos < 1) {
            System.out.println("Invalid position!");
            return head;
        }

        if(pos == 1){
            return insertAtBegin(head , value);
        }

        Node prev = head;
        int count = 1;
        while (count < pos - 1 && prev != null) {
            prev = prev.next;
            count++;
        }

        if (prev == null) {
            System.out.println("Invalid position!");
            return head;
        }

        Node newNode = new Node(value);
        newNode.next = prev.next;
        prev.next = newNode;

        return head;
    }

    public static Node removeFirstNode(Node head){
        if (head == null)
            return null;

        head = head.next;

        return head;
    }

    public static Node removeLastNode(Node head){
        if(head == null){
            return null;
        }

        if (head.next == null) {
            return null;
        }

        Node second_last = head;
        while (second_last.next.next != null)
            second_last = second_last.next;

        second_last.next = null;

        return head;
    }

    public static Node removeAtPos(Node head , int pos){

        if(head == null){
            return null;
        }

        if (pos < 1) {
            System.out.println("Invalid position!");
            return head;
        }

        if(pos == 1){
            return removeFirstNode(head);
        }

        Node prev = head;
        int count = 1;
        while (count < pos - 1 && prev != null) {
            prev = prev.next;
            count++;
        }

        if (prev == null || prev.next == null) {
            System.out.println("Invalid position!");
            return head;
        }

        if(prev.next.next == null){
             prev.next = null;
             return head;
        }

        prev.next = prev.next.next;

        return head;
    }

}
