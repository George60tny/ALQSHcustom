package org.example;
import java.util.NoSuchElementException;

public class MyStack<T> {
    private Node<T> top;
    private int size;

    private static class Node<T> {
        T value;
        Node<T> next;

        Node(T value) {
            this.value = value;
        }
    }

    public MyStack() {
        top = null;
        size = 0;
    }

    public void push(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            top = top.next;
        } else {
            Node<T> currentNode = top;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            currentNode.next = currentNode.next.next;
        }
        size--;
    }

    public void clear() {
        top = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public T peek() {
        if (top == null) {
            throw new NoSuchElementException();
        }
        return top.value;
    }

    public T pop() {
        if (top == null) {
            throw new NoSuchElementException();
        }

        T value = top.value;
        top = top.next;
        size--;
        return value;
    }
}