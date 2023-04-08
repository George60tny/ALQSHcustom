package org.example;
import java.util.NoSuchElementException;


public class MyStack {
    private Node top;
    private int size;

    private static class Node {
        Object value;
        Node next;

        Node(Object value) {
            this.value = value;
        }
    }

    public void push(Object value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public void remove(int index) {
        if (index >= 0 && index < size) {
            if (index == 0) {
                top = top.next;
            } else {
                Node current = top;
                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                }
                current.next = current.next.next;
            }
            size--;
        }
    }

    public void clear() {
        top = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object peek() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        return top.value;
    }

    public Object pop() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        Object value = top.value;
        top = top.next;
        size--;
        return value;
    }
}