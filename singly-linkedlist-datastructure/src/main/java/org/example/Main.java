
package org.example;

public class Main {
    public static void main(String[] args) {
        Node node1 = new Node(10);
        node1 = Node.insertAtLast(node1 , 20);
        node1 = Node.insertAtLast(node1 , 20);
        node1 = Node.insertAtLast(node1 , 40);
        node1 = Node.insertAtBegin(node1,50);
        node1 = Node.insertAtPos(node1 , 5 , 1);
        node1 = Node.insertAtBegin(node1,50);
        Node.traverse(node1);
    }
}