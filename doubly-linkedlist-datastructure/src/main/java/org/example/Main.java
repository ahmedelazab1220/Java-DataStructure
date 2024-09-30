package org.example;

public class Main {
    public static void main(String[] args) {

        Node head = new Node(10);
        head = Node.insertAtBegin(head,5);
        head = Node.insertAtLast(head,15);
        Node.forwardTraversal(head);
        System.out.println("----------------------------------------------------------");

        head = Node.insertAtPos(head,5,20);
        assert head != null;
        Node tail = head.next.next.next;
        Node.backwardTraversal(tail);
        System.out.println("----------------------------------------------------------");

        System.out.println("Search Value -> 10 In head -> " + Node.searchItem(head , 10));
        System.out.println("----------------------------------------------------------");

        head = Node.removeAtPos(head , 3);
        Node.forwardTraversal(head);
        System.out.println("----------------------------------------------------------");

        head = Node.removeLastNode(head);
        Node.forwardTraversal(head);
        System.out.println("----------------------------------------------------------");

        System.out.println("Length Of Doubly LinkedList -> " + Node.calculateLengthOfLinkedList(head));

    }
}