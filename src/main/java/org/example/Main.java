package org.example;

public class Main {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();

        // Додаємо в массив елементи
        list.add("a");
        list.add("b");
        list.add("c");

        // Перевірка - розмір та состав
        System.out.println(list.size()); // 3
        System.out.println(list.get(0)); // a
        System.out.println(list.get(1)); // b
        System.out.println(list.get(2)); // c

        // Видаляємо елемент b
        list.remove(1);

        // Перевірка - розмір та состав №2
        System.out.println(list.size()); // 2
        System.out.println(list.get(0)); // a
        System.out.println(list.get(1)); // c

        // Чистимо массив
        list.clear();

        // Перевірка успіху
        System.out.println(list.size()); // Output: 0
        }
    }