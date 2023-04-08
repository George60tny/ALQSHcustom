package org.example;
import java.util.NoSuchElementException;

public class MyQueue {
    private Node head;
    private Node tail;
    private int size;

    private static class Node {
        Object value;
        Node next;

        Node(Object value) {
            this.value = value;
        }
    }

    public void add(Object value) {
        Node newNode = new Node(value);
        if (size == 0) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void clear() {
        head = tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object peek() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        return head.value;
    }

    public Object poll() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        Object value = head.value;
        head = head.next;
        size--;
        if (size == 0) {
            tail = null;
        }
        return value;
    }
}