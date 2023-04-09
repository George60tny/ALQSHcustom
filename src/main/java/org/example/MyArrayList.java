package org.example;

public class MyArrayList<T> {
    private T[] data;
    private int size;

    @SuppressWarnings("unchecked")
    public MyArrayList() {
        data = (T[]) new Object[0];
        size = 0;
    }

    public void add(T value) {
        if (size == data.length) {
            T[] newData = (T[]) new Object[data.length + 1];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }

        data[size] = value;
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        data[size - 1] = null;
        size--;
    }

    public void clear() {
        size = 0;
        data = (T[]) new Object[0];
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        return data[index];
    }
}