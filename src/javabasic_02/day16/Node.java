package javabasic_02.day16;

public class Node<T> {
    T data;
    Node<T> next = null;
    public Node(T data) {
        this.data = data;
    }
}
