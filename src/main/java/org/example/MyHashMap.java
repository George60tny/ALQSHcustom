package org.example;

public class MyHashMap {
    private Node[] buckets;
    private int size;

    private static class Node {
        Object key;
        Object value;
        Node next;

        Node(Object key, Object value) {
            this.key = key;
            this.value = value;
        }
    }

    public MyHashMap() {
        buckets = new Node[16];
        size = 0;
    }

    public void put(Object key, Object value) {
        int index = getIndex(key);
        Node current = buckets[index];

        if (current == null) {
            buckets[index] = new Node(key, value);
            size++;
        } else {
            while (true) {
                if (current.key.equals(key)) {
                    current.value = value;
                    break;
                }
                if (current.next == null) {
                    current.next = new Node(key, value);
                    size++;
                    break;
                }
                current = current.next;
            }
        }
    }

    public void remove(Object key) {
        int index = getIndex(key);
        Node current = buckets[index];

        if (current != null) {
            if (current.key.equals(key)) {
                buckets[index] = current.next;
                size--;
            } else {
                while (current.next != null) {
                    if (current.next.key.equals(key)) {
                        current.next = current.next.next;
                        size--;
                        break;
                    }
                    current = current.next;
                }
            }
        }
    }

    public void clear() {
        buckets = new Node[16];
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object get(Object key) {
        int index = getIndex(key);
        Node current = buckets[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }

        return null;
    }

    private int getIndex(Object key) {
        return Math.abs(key.hashCode()) % buckets.length;
    }
}