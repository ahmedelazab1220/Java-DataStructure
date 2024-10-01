package org.example;

public class Main {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(5);
        st.push(15);
        st.pop();
        st.push(16);
        System.out.println(st.peek());
        System.out.println(st.head);
        st.traverse();
        System.out.println();
    }
}