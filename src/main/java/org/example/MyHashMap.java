package org.example;

public class MyHashMap<K, V> {
    private Node<K, V>[] buckets;
    private int size;

    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    @SuppressWarnings("unchecked")
    public MyHashMap() {
        buckets = (Node<K, V>[]) new Node[16];
        size = 0;
    }

    public void put(K key, V value) {
        int index = getIndex(key);
        Node<K, V> current = buckets[index];

        if (current == null) {
            buckets[index] = new Node<>(key, value);
            size++;
        } else {
            while (true) {
                if (current.key.equals(key)) {
                    current.value = value;
                    break;
                }
                if (current.next == null) {
                    current.next = new Node<>(key, value);
                    size++;
                    break;
                }
                current = current.next;
            }
        }
    }

    public void remove(K key) {
        int index = getIndex(key);
        Node<K, V> current = buckets[index];

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
        buckets = (Node<K, V>[]) new Node[16];
        size = 0;
    }

    public int size() {
        return size;
    }

    public V get(K key) {
        int index = getIndex(key);
        Node<K, V> current = buckets[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }

        return null;
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode()) % buckets.length;
    }
}