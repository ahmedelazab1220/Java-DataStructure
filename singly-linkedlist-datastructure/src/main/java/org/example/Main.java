
package org.example;

public class Main {
    public static void main(String[] args) {
        Node node1 = new Node(10);
        node1 = Node.insertAtLast(node1 , 20);
        node1 = Node.insertAtLast(node1 , 40);
        node1 = Node.insertAtBegin(node1,50);
        node1 = Node.insertAtPos(node1 , 5 , 1);
        node1 = Node.insertAtBegin(node1,6);
        Node.traverse(node1);
        System.out.println("----------------------------------------------------");
        node1 = Node.removeFirstNode(node1);
        Node.traverse(node1);
        System.out.println("----------------------------------------------------");
        node1 = Node.removeLastNode(node1);
        Node.traverse(node1);
        System.out.println("----------------------------------------------------");
        node1 = Node.removeAtPos(node1 , 5);
        Node.traverse(node1);
        System.out.println("----------------------------------------------------");
        System.out.println("Length Of node1 -> " + Node.calculateLengthOfLinkedList(node1));
        System.out.println("----------------------------------------------------");
        System.out.println("Search Value -> 10 in node1 -> " + Node.searchItem(node1 , 10));
    }
}