package org.example;
public class Node {

    int data;

    Node next;

    Node prev;

    public Node(int data){
        this.data = data;
        this.next = this.prev = null;
    }

    public static void forwardTraversal(Node head){
        Node current = head;

        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }

    }

    public static void backwardTraversal(Node tail){
        Node current = tail;

        while(current != null){
            System.out.println(current.data);
            current = current.prev;
        }

    }

    public static Node insertAtBegin(Node head , int data){
        Node newNode = new Node(data);

        newNode.next = head;

        if(head != null){
            head.prev = newNode;
        }

        return newNode;
    }

    public static Node insertAtLast(Node head , int data){
        Node newNode = new Node(data);

        if(head == null) return newNode;

        Node current = head;

        while(current.next != null){
            current = current.next;
        }

        current.next = newNode;
        newNode.prev = current;

        return head;
    }

    public static Node insertAtPos(Node head , int pos , int data){

        if (pos < 1) {
            System.out.println("Invalid position!");
            return head;
        }

        if(pos == 1){
            return insertAtBegin(head , data);
        }

        Node current = head;
        int count = 1;
        while(count < pos - 1 && current != null){
            current = current.next;
            count++;
        }

        if(current == null){
            System.out.println("Invalid position!");
            return head;
        }

        Node newNode = new Node(data);

        newNode.prev = current;
        newNode.next = current.next;
        current.next = newNode;

        if(newNode.next != null){
            newNode.next.prev = newNode;
        }

        return head;
    }

    public static boolean searchItem(Node head , int data){
        Node current = head;
        while(current != null){
            if(current.data == data){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static int calculateLengthOfLinkedList(Node head){
        int count = 0;

        while(head != null){
            head = head.next;
            count++;
        }

        return count;
    }

    public static Node removeFirstNode(Node head){
        if(head == null){
            return null;
        }

        head = head.next;

        if(head != null){
            head.prev = null;
        }

        return head;
    }

    public static Node removeLastNode(Node head){
        if(head == null){
            return null;
        }

        Node current = head;

        while(current.next != null){
            current = current.next;
        }

        if(current.prev != null) {
            current.prev.next = null;
        }
        else{
            return removeFirstNode(head);
        }

        return head;
    }

    public static Node removeAtPos(Node head , int pos){
        if(pos < 1){
            System.out.println("Invalid position!");
            return null;
        }

        if(pos == 1){
            return removeFirstNode(head);
        }

        Node current = head;
        int count = 1;
        while(count < pos - 1 && current != null){
            current = current.next;
            count++;
        }

        if(current == null){
            System.out.println("Invalid position!");
            return head;
        }

        if(current.next != null) {
            current.prev.next = current.next;
        }

        if(current.next != null){
            current.next.prev = current.prev;
        }

        return head;
    }

}
